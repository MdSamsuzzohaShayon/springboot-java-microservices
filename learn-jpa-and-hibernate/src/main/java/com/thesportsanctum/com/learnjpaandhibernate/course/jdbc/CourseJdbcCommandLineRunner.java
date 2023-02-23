package com.thesportsanctum.com.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thesportsanctum.com.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(3, "Learn Python", "Shayon"));
		repository.insert(new Course(4, "Learn Python 4", "Shayon"));
		repository.insert(new Course(5, "Learn Python 5", "Shayon"));
		
		repository.deleteById(4);
	}

}
