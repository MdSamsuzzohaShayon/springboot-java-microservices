package com.tss.shayon.employeeservice.service;

import com.tss.shayon.employeeservice.entity.EmployeeEntity;

import com.tss.shayon.employeeservice.repo.EmployeeRepository;
import com.tss.shayon.employeeservice.response.EmployeeResponse;
import com.tss.shayon.employeeservice.response.AddressResponse;
import com.tss.shayon.employeeservice.openfeignclients.*;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class EmployeeService {

    // Spring @Autowired annotation is used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file.
    // Spring framework provides autowiring features too where we don’t need to provide bean injection details explicitly.
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;
    
    
    @Autowired
    private WebClient webClient;


    @Value("${addressservice.base.url}")
    private String addressBaseUrl;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private DiscoveryClient discoveryClient;
    
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    
    @Autowired
    private AddressClient addressClient;
    
    /*
     * Rest Template API call

    
    
    // Configure rest template using constructor
    public EmployeeService(@Value("${addressservice.base.url}") String addressBaseUrl, RestTemplateBuilder builder) {
    	 System.out.println("URI = " + addressBaseUrl);
    	this.restTemplate = builder
    			.rootUri(addressBaseUrl)
    			.build();
    }
    
    private AddressResponse callingAddressServiceUsingRestTemlate(int id) {
    	return restTemplate.getForObject("/address/{id}", AddressResponse.class);
    }
    */
    
    public EmployeeResponse getEmployeeEntity(int id) {
    	
    	
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        // Return employee response

        /*
        // Object maping manually
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(employeeEntity.getId());
        employeeResponse.setName(employeeEntity.getName());
        employeeResponse.setEmail(employeeEntity.getEmail());
        employeeResponse.setBloodgroup(employeeEntity.getBloodgroup());
         */

        
        // Use model mapper instead
        EmployeeResponse employeeResponse = modelMapper.map(employeeEntity, EmployeeResponse.class);
        // Set data to address response by making a rest api call
        // curl http://localhost:8081/address-app/api/address/1
        
        /*
        // GET ONE INSTANCE IN OUR DISCOVERY SERVICE
        List<ServiceInstance> instances = discoveryClient.getInstances("address-service");
        ServiceInstance serviceInstance = instances.get(0);
        String uri = serviceInstance.getUri().toString();
        */
        
        
        /*
        // DISTRIBUTE REQUEST EQUALLY - LOW LEVEL CODE
        ServiceInstance serviceInstance = loadBalancerClient.choose("address-service");
        String uri = serviceInstance.getUri().toString();
        String contextRoot = serviceInstance.getMetadata().get("configPath");
        System.out.println("URL >>>>>>>>> " + uri + contextRoot);
        AddressResponse addressResponse = restTemplate.getForObject(uri + contextRoot + "/address/{id}", AddressResponse.class , id);
        */
        
        // address-service is a instance registered in eureka
//        AddressResponse addressResponse = restTemplate.getForObject("http://address-service/address-app/api/address/{id}", AddressResponse.class , id);
        
        
        // MAKE REQUEST USING OPEN FEIGN
        AddressResponse addressResponse = addressClient.getAddressbyEmployeeId(id).getBody(); 
//        System.out.println("URL >>>>>>>>> " + uri);
        
//        AddressResponse addressResponse = webClient
//        		.get()
//        		.uri("/address/"+id)
//        		.retrieve()
//        		.bodyToMono(AddressResponse.class)
//        		.block();
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

    
}
