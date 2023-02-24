package com.thesportsanctum.com.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thesportsanctum.com.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{ 

}
