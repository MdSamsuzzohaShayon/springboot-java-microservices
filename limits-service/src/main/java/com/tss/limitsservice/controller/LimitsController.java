package com.tss.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tss.limitsservice.bean.Limits;
import com.tss.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrivelimits() {
//		return new Limits(1, 10);
		System.out.println(configuration.getMin());
		System.out.println(configuration.getMax());
		return new Limits(configuration.getMin(), configuration.getMax());
	}
}
