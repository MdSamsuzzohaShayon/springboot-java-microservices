package com.tss.shayon.employeeservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tss.shayon.employeeservice.response.AddressResponse;

@FeignClient(name="addcliname", url="http://localhost:8081/address-app/api/")
public interface AddressClient { // Proxy class
	
	@GetMapping("/address/{id}")
	AddressResponse getAddressbyEmployeeId(@PathVariable("id") int id);
}
