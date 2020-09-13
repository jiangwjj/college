package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.service.StudentService;

public class students {
StudentService ss= new StudentService();
	@Test
	public void testAddStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelStudent() {
		new StudentService().delStudent(201300213);
	}

	@Test
	public void testAlterStudent() {
		ss.delStudent(2013001);
	}

	@Test
	public void testFindStudentById() {
		fail("Not yet implemented");
	}

	@Test
	public void testTotalStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentByClass() {
		fail("Not yet implemented");
	}

}
