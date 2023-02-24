package com.thesportsanctum.com.restfulwebservices.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		

		//		1) all requests should be authenticated
		http.authorizeHttpRequests(
					auth -> auth.anyRequest().authenticated()
				);

		//		2) If the request is not authenticated, a web page shown
		http.httpBasic(withDefaults());

		//		3) CSRF on POST and PUT
		http.csrf().disable();
		return http.build();		
	}
}
