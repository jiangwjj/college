package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.service.TeacherService;
import com.jwj.vo.Teacher;

public class kkk {
Teacher t= new Teacher();
TeacherService ts= new TeacherService();
	@Test
	public void testAddTeacher() {
	t.setCourseid(2001);
		t.setTeaname("32");
		t.setTeagender("32");
		t.setTeapassword("32");
		t.setTeaid(32);
		ts.addTeacher(t);
	}

	@Test
	public void testDelTeacher() {

	
	}

	@Test
	public void testFindByAllTeacher() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindTeacherByid() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateTeacher() {
		t.setTeaname("32");
		t.setTeagender("32");
		t.setTeapassword("32");
		t.setTeaid(54);
		ts.UpdateTeacher(t);
	}

	@Test
	public void testLoginCheck() {
		fail("Not yet implemented");
	}

}
