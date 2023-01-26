package com.tss.shayon.employeeservice.repository;

import com.tss.shayon.employeeservice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
