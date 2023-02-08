package com.tss.shayon.employeeservice.controller;

import com.tss.shayon.employeeservice.entity.EmployeeEntity;
import com.tss.shayon.employeeservice.repo.EmployeeRepository;
import com.tss.shayon.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html
//A convenience annotation that is itself annotated with @Controller and @ResponseBody.
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // Annotation for mapping HTTP GET requests onto specific handler methods.
    @GetMapping("/employees/{id}")
    public EmployeeEntity getEmployeeDetails(@PathVariable("id") int id ){
        EmployeeEntity employeeEntityById = employeeService.getEmployeeEntity(id);
        // instead of returning employee entity directly return a model object
        return employeeEntityById;
    }
}
