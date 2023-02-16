package com.tss.shayon.employeeservice.openfeignclients;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(name = "ADDRESS-SERVICE", configuration = CustomLoadBalancerConfig.class)
public class AddressServiceLoadBalancer {

	public AddressServiceLoadBalancer() {
		// TODO Auto-generated constructor stub
	}
	
	@LoadBalanced
	@Bean
	public Feign.Builder feiBuilder(){
		return Feign.builder();
	}

}
