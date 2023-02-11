package com.tss.shayon.employeeservice.service;

import com.tss.shayon.employeeservice.entity.EmployeeEntity;
import com.tss.shayon.employeeservice.feignclient.AddressClient;
import com.tss.shayon.employeeservice.repo.EmployeeRepository;
import com.tss.shayon.employeeservice.response.AddressResponse;
import com.tss.shayon.employeeservice.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
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
    private AddressClient addressClient;
    
    


    public EmployeeResponse getEmployeeEntity(int id) {
    	
    	
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        // Return employee response

        // Use model mapper instead
        EmployeeResponse employeeResponse = modelMapper.map(employeeEntity, EmployeeResponse.class);
                
        AddressResponse addressResponse = addressClient.getAddressbyEmployeeId(id); 
        
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

    
}
