package com.tss.shayon.employeeservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tss.shayon.employeeservice.response.AddressResponse;

@FeignClient(name="address-service", url = "http://localhost:8081",path="/address-app/api/")
public interface AddressClient { // Proxy class

	/*
	@GetMapping("/address/{id}")
	AddressResponse getAddressbyEmployeeId(@PathVariable("id") int id);
	*/
	
	// We can copy the exact code from address controller -> rest controller
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressbyEmployeeId(@PathVariable("employeeId") int id);
}
