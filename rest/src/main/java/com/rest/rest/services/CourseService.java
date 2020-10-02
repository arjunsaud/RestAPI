package com.rest.rest.services;
import java.util.List;

import com.rest.rest.entities.*;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	public void deleteCourse(long courseId);

}
