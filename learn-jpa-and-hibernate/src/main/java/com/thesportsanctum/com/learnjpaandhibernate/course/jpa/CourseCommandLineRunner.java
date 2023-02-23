package com.thesportsanctum.com.learnjpaandhibernate.course.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thesportsanctum.com.learnjpaandhibernate.course.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepository repository; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(6, "Learn Python jpa 6", "Shayon"));
		repository.insert(new Course(7, "Learn Python jpa 7", "Shayon"));
		repository.insert(new Course(8, "Learn Python jpa 8", "Shayon"));
		
		repository.deleteById(7);
		
		System.out.println(repository.findById(8));
	}

}

