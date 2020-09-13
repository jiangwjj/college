package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.service.AdminService;
import com.jwj.service.StudentService;
import com.jwj.vo.Admin;
import com.jwj.vo.Student;

public class login {

	@Test
	public void test() {
		Student student= new Student();
		
		student.setLate(0);
		student.setStuout(111);
		student.setStuid(20131002);
		new StudentService().updateStudentByTeacher(student);
		
	}

}
