package com.thesportsanctum.com.restfulwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private UserDaoService service;
	
	public UserResource(UserDaoService service) {
		this.service = service;
	}

	
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable Integer id){
		return service.findOne(id);
	}
	
	// curl -X POST http://localhost:8080/users -d '{"name":"Ravi", "birthdate":"1993-02-17"}' -H 'Content-Type: application/json'
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		service.save(user);
	}
}
















