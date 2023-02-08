package com.tss.shayon.addressservice.repository;

import com.tss.shayon.addressservice.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
    // Find address based on id
    // make raw query manually
    // The JPA module supports defining a query manually as a String or having it being derived from the method name
    // either use JPA named queries through a naming convention (see Using JPA Named Queries for more information) or rather annotate your query method with @Query (see Using @Query for details).
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
    @Query(nativeQuery = true, value = "SELECT a.id, a.lane1, a.lane2, a.zip, a.state FROM address a INNER JOIN employee e ON a.fk_employee_id=e.id WHERE a.fk_employee_id=:employeeId")
    AddressEntity findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
