package com.tss.shayon.employeeservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// @Configuration annotation indicates that the class has @Bean definition methods - https://www.geeksforgeeks.org/spring-configuration-annotation-with-example/
//One of the most important annotations in spring is @Configuration annotation which indicates that the class has @Bean definition methods.
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class EmployeeMapConfig {
	
	@Value("${addressservice.base.url}")
    private String addressBaseUrl;

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    
}
