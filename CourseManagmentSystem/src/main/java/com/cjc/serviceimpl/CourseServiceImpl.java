package com.cjc.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.model.Course;
import com.cjc.repository.CourseRepo;
import com.cjc.servicei.CourseServiceI;

public class CourseServiceImpl implements CourseServiceI {
	
	@Autowired
	CourseRepo cr;

	@Override
	public Course AddCouser(Course c) {
		
		return cr.save(c);
	}

	@Override
	public Iterable<Course> GetAllData() {
		
		return cr.findAll();
	}

	@Override
	public void Delete(int id) {
		cr.deleteById(id);
		
		
	}

	@Override
	public Course upadateCourse(String courseName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
