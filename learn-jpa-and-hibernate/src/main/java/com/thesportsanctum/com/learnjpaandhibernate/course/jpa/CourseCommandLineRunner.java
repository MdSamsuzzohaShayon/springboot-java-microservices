package com.thesportsanctum.com.learnjpaandhibernate.course.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thesportsanctum.com.learnjpaandhibernate.course.Course;
import com.thesportsanctum.com.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJpaRepository jpaRepository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		jpaRepository.insert(new Course(6, "Learn Python jpa 6", "Shayon"));
		jpaRepository.insert(new Course(7, "Learn Python jpa 7", "Shayon"));
		jpaRepository.insert(new Course(8, "Learn Python jpa 8", "Shayon"));
		
		jpaRepository.deleteById(7);
		
		System.out.println(jpaRepository.findById(8));
		*/
		
		repository.save(new Course(6, "Learn Python jpa 6", "Shayon"));
		repository.save(new Course(7, "Learn Python jpa 7", "Shayon"));
		repository.save(new Course(8, "Learn Python jpa 8", "Shayon"));
		
		repository.deleteById(7l);
		
		System.out.println(repository.findById(8l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Shayon"));
		System.out.println(repository.findByName("Learn Python jpa 8"));
		
	}

}

