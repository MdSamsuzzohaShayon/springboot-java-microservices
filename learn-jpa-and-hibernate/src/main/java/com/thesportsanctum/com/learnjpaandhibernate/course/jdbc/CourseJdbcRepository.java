package com.thesportsanctum.com.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.thesportsanctum.com.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static final String INSERT_QUERY = """
			INSERT INTO COURSE(id, name, author) 
			VALUES 
			(?, ?, ?);
			""";
	private static final String DELETE_QUERY = """
			DELETE FROM COURSE
			WHERE id=?
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
}
