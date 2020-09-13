package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.service.TeacherService;

public class query {

	@Test
	public void test() {
		TeacherService ts= new TeacherService();
		System.out.println(ts.findTeacherByid(1).getTeaname());
		System.out.println(ts.findTeacherByid(1).getTeagender());
		System.out.println(ts.findTeacherByid(1).getTeaid());
	}

}
