package com.thesportsanctum.com.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thesportsanctum.com.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{ 

}
