package com.thesportsanctum.com.restfulwebservices.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {
	
	//URL versioning
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Bob", "v2"));
	}
	
	// Request params versioning
	// curl http://localhost:8080/person?version=1
	@GetMapping(path = "/person", params="version=1")
	public PersonV1 getVersionOfPersonWithParams() {
		return new PersonV1("Charlie");
	}
	
	@GetMapping(path = "/person", params="version=2")
	public PersonV2 getSecondFourthVersionOfPersonParams() {
		return new PersonV2(new Name("Bob", "v2"));
	}
	
	
	// Custom headers versioning
	//	curl --location 'localhost:8080/person' --header 'X-API-VERSION: 1'
	@GetMapping(path = "/person/header", headers="X-API-VERSION=1")
	public PersonV1 getVersionOfPersonWithHeader() {
		return new PersonV1("Charlie");
	}
	
	//	curl --location 'localhost:8080/person' --header 'X-API-VERSION: 2'
	@GetMapping(path = "/person/header", headers="X-API-VERSION=2")
	public PersonV2 getSecondVersionOfPersonWithHeader() {
		return new PersonV2(new Name("Bob", "v2"));
	}
	
	// Media type versioning - content negotiation
	//	curl --location 'localhost:8080/person/accept' --header 'Accept: application/vnd.company.app-v1+json'
	@GetMapping(path = "/person/accept", produces="application/vnd.company.app-v1+json")
	public PersonV1 getVersionOfPersonWithAcceptHeader() {
		return new PersonV1("Charlie");
	}
	
	//	curl --location 'localhost:8080/person/accept' --header 'Accept: application/vnd.company.app-v2+json'
	@GetMapping(path = "/person/accept", produces="application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionOfPersonWithAcceptHeader() {
		return new PersonV2(new Name("Bob", "v2"));
	}
}
