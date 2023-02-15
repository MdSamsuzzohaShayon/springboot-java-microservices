package com.tss.shayon.employeeservice.openfeignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tss.shayon.employeeservice.response.AddressResponse;



@FeignClient(name = "ADDRESS-SERVICE", path="/address-app/api/")
public interface AddressClient {
	@GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressbyEmployeeId(@PathVariable("employeeId") int id);

}
