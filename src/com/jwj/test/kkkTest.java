package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.service.StudentService;
import com.jwj.vo.Student;

public class kkkTest {

	@Test
	public void test() {
		Student s=new Student();
		s.setStuid(2);
		s.setStuclass("stuclass");
		s.setStugender("stugender");
		s.setStuname("dss");
		
		new StudentService().addStudent(s);
	}

}
