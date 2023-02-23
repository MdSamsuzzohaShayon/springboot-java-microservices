package com.thesportsanctum.com.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static final String INSERT_QUERY = """
			INSERT INTO COURSE(id, name, author) 
			VALUES 
			(2, 'English', 'Shayon');
			""";
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
