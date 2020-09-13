package com.jwj.service;

import java.util.List;

import com.jwj.dao.TeacherDao;

import com.jwj.vo.Teacher;

/*
 * 老师service
 */
public class TeacherService {
	TeacherDao sd = new TeacherDao();

	// 添加老师
	public void addTeacher(Teacher s) {
		sd.addTeacher(s);
	}

	// 删除老师
	public void delTeacher(int teaid) {
		sd.delTeacherById(teaid);

	}

	//查询所有老师信息
	public List<Teacher> findByAllTeacher() {
		return sd.findTeacherbyAll();

	}
	//根据id查询老师信息
	public Teacher findTeacherByid(int teaid)
	{
		return sd.findStudentByid(teaid);
	}
	//修改老师信息
	public void UpdateTeacher(Teacher s)
	{
		sd.updateTeacher(s);
	}
	public Teacher loginCheck(String name,String password)
	{
		
		return sd.findStudentByNameAndPassword(name, password);
	}
	//修改密码
	public void changePassword(Teacher s)
	{
		
		sd.changePassword(s);
	}
}
