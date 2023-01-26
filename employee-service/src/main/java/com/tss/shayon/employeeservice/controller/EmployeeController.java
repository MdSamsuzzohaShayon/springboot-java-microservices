package com.tss.shayon.employeeservice.controller;

import com.tss.shayon.employeeservice.entity.EmployeeEntity;
import com.tss.shayon.employeeservice.repository.EmployeeRepository;
import com.tss.shayon.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees/{id}")
    public EmployeeEntity getEmployeeDetails(@PathVariable("id") int id){
        EmployeeEntity employeeEntity = employeeService.getEmployeeById(id);
        return employeeEntity;
    }
}
