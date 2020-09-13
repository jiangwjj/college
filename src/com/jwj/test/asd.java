package com.jwj.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.jwj.service.StudentService;
import com.jwj.service.TeacherService;
import com.jwj.vo.Student;
import com.jwj.vo.Teacher;

public class asd {

	@Test
	public void test() {
		
		String s=new StudentService().findStudentByteacher(20131002).getStuname();
		System.out.println(s);
	}

}
