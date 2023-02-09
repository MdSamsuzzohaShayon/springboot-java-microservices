package com.tss.shayon.employeeservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// @Configuration annotation indicates that the class has @Bean definition methods - https://www.geeksforgeeks.org/spring-configuration-annotation-with-example/
//One of the most important annotations in spring is @Configuration annotation which indicates that the class has @Bean definition methods.
import org.springframework.web.client.RestTemplate;
@Configuration
public class EmployeeMapConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    
    @Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }
}
