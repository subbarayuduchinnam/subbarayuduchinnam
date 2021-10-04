package com.subbu.LearnSpringBoot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.LearnSpringBoot.courses.beans.Courses;

@RestController
public class CoursesController {
	
	@GetMapping("/course")
	public List<Courses> getAllCourses(){
		return Arrays.asList(new Courses(1,"Learn Springboot","subbu"),
				new Courses(2,"Learn MicroServices","subbu"));
	}
	
	
	@GetMapping("/course/1")
	public Courses getCourseDetails(){
		return new Courses(1,"Learn Springboot 1","subbu");
	}
	
}
