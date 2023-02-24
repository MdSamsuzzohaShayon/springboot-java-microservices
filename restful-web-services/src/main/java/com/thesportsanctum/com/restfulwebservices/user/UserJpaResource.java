package com.thesportsanctum.com.restfulwebservices.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.thesportsanctum.com.restfulwebservices.jpa.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserJpaResource {
	
	
	private UserRepository repository;
	
	public UserJpaResource(UserRepository repository) {
		this.repository = repository;
	}

	
	@GetMapping("/jpa/users")
	public List<User> retriveAllUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retriveUser(@PathVariable Integer id){
		Optional<User> user =  repository.findById(id);
		if(user.isEmpty()) {
			throw new UserNotFoundException("id: "+id);
		}
		EntityModel<User> entityModel = EntityModel.of(user.get());
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retriveAllUsers());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}
	
	// curl -X DELETE http://localhost:8080/jpa/users/1001
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable Integer id){
		repository.deleteById(id);
	}
	
	// curl -X POST http://localhost:8080/jpa/users -d '{"name":"Ravi", "birthdate":"1993-02-17"}' -H 'Content-Type: application/json'
	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = repository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
















