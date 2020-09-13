package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.service.StudentService;

public class student {

	@Test
	public void test() {
		System.out.println(new StudentService().findStudentById(20132005)
				.getStuname());
	}

}
