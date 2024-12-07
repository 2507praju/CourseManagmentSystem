package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Course;
import com.cjc.servicei.CourseServiceI;

@RestController
public class CourseController {
	
	@Autowired
	CourseServiceI cs;
	
	@PostMapping("/add")
	public ResponseEntity<Course> AddCourse(@RequestBody Course c){
		Course c1=cs.AddCouser(c);
		return new  ResponseEntity<Course>(c1,HttpStatus.OK);
	}
	
	@GetMapping("/GetCourse")
	public Iterable<Course> GetAllCourse(){
		
		return cs.GetAllData( );
	} 
	
	@DeleteMapping("delData/{id}")
	public void Delete(@PathVariable int id){
		 cs.Delete(id);
	}
	
	@PutMapping("updataCousre/{courseName}")
	public  ResponseEntity<Course> updataCourse(@PathVariable String courseName){
		Course cc=cs.upadateCourse(courseName);
		return new ResponseEntity<Course> (cc,HttpStatus.OK);
	}
	
	

	
	
}
