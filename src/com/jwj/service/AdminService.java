package com.jwj.service;

import com.jwj.dao.AdminDao;
import com.jwj.dao.TeacherDao;
import com.jwj.vo.Admin;
import com.jwj.vo.Teacher;
/*
 * ����Աdao
 */
//�����û����������ѯ
public class AdminService {
	AdminDao ad=new AdminDao();
	TeacherDao td= new TeacherDao();
	public Admin adminLogin(String adminname,String adminpassword)
	{
		return ad.findbyNameAndPassword(adminname, adminpassword);
		
	}
	public Teacher teacherLogin(String teaname,String teapassword)
	{
		return td.findStudentByNameAndPassword(teaname, teapassword);
		
	}
}