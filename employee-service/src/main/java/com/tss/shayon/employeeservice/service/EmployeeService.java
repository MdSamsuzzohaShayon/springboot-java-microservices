package com.tss.shayon.employeeservice.service;

import com.tss.shayon.employeeservice.entity.EmployeeEntity;
import com.tss.shayon.employeeservice.repo.EmployeeRepository;
import com.tss.shayon.employeeservice.response.AddressResponse;
import com.tss.shayon.employeeservice.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    // Spring @Autowired annotation is used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file.
    // Spring framework provides autowiring features too where we don’t need to provide bean injection details explicitly.
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;
    
    // @Autowired
    private RestTemplate restTemplate;
    
    @Value("${addressservice.base.url}")
    private String addressBaseUrl;

    public EmployeeService(@Value("${addressservice.base.url}") String addressBaseUrl, RestTemplateBuilder builder) {
    	 System.out.println("URI = " + addressBaseUrl);
    	this.restTemplate = builder
    			.rootUri(addressBaseUrl)
    			.build();
    }
    
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
        AddressResponse addressResponse = restTemplate.getForObject(addressBaseUrl + "/address/{id}", AddressResponse.class , id);
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

}
