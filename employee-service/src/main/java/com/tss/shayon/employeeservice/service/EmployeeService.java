package com.tss.shayon.employeeservice.service;

import com.tss.shayon.employeeservice.entity.EmployeeEntity;
import com.tss.shayon.employeeservice.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    // Spring @Autowired annotation is used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file.
    // Spring framework provides autowiring features too where we don’t need to provide bean injection details explicitly.
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeEntity getEmployeeEntity(int id){
    EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        return employeeEntity;
    }

}
