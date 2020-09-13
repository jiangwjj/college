package com.jwj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jwj.dao.TeacherDao;
import com.jwj.vo.Teacher;

public class teacher {

	@Test
	public void test() {
TeacherDao td=new TeacherDao();
Teacher t= new Teacher();
t.setTeaid(2015003);
t.setTeapassword("123");
td.changePassword(t);
	}

}
