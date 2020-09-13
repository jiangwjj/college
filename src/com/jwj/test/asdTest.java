package com.jwj.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.jwj.service.StudentService;
import com.jwj.vo.All;

public class asdTest {

	@Test
	public void test() {
		String  name=null;
		String username=null;
		List<All> list=new StudentService().findStudentByClassAndCourseName("1","jwj");
		
	
			
			 username=list.get(1).getStuname();
			 System.out.println(name+""+username);
			

	
}
}