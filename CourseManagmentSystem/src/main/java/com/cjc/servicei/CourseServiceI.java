package com.cjc.servicei;

import org.springframework.stereotype.Service;

import com.cjc.model.Course;

@Service
public interface CourseServiceI {

	public Course AddCouser(Course c);

	
	public void Delete(int id);

	Iterable<Course> GetAllData();


	public Course upadateCourse(String courseName);

}
