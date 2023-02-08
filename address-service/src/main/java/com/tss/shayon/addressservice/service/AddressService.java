package com.tss.shayon.addressservice.service;

import com.tss.shayon.addressservice.entity.AddressEntity;
import com.tss.shayon.addressservice.repository.AddressRepository;
import com.tss.shayon.addressservice.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service annotation is used with classes that provide some business functionalities. Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used. - https://www.geeksforgeeks.org/spring-service-annotation-with-example/
// Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state. - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Service.html
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;



    public AddressResponse findAddressByEmployeeId(int employeeId){
        AddressEntity addressEntity = addressRepository.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = modelMapper.map(addressEntity, AddressResponse.class);
        return  addressResponse;
    }
}
