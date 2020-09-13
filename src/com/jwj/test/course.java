package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.service.CourseService;
import com.jwj.vo.Course;

public class course {
CourseService cs= new CourseService();
Course c=new Course();
	@Test
	public void testAddCourse() {
		c.setCourseid(2);
		c.setCoursename("C#");
		cs.updateCourse(c);
	}

	

}
