package com.tss.shayon.employeeservice.repo;


import com.tss.shayon.employeeservice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<EmployeeEntity, Integer> // id in employee is integer that is why Integer is here
/**
 * IMPLEMENTATION WILL BE CREATED THROUGH THE PROXY IN THE RUNTIME WHEN EVER WE EXTEND JPA REPOSITORY
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
