package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.dao.StudentDao;
import com.jwj.service.CourseService;
import com.jwj.vo.Course;
import com.jwj.vo.Student;

public class cousre {

	@Test
	public void test() {
		Student s= new Student();
		s.setStuid(20131001);
		s.setStudate("2013");
		s.setLate(0);
		s.setStuout(2);
		
		new StudentDao().updateStudentByteacher(s);
	}

}
