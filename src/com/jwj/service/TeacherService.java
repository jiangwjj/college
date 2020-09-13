package com.jwj.service;

import java.util.List;

import com.jwj.dao.TeacherDao;

import com.jwj.vo.Teacher;

/*
 * ��ʦservice
 */
public class TeacherService {
	TeacherDao sd = new TeacherDao();

	// ������ʦ
	public void addTeacher(Teacher s) {
		sd.addTeacher(s);
	}

	// ɾ����ʦ
	public void delTeacher(int teaid) {
		sd.delTeacherById(teaid);

	}

	//��ѯ������ʦ��Ϣ
	public List<Teacher> findByAllTeacher() {
		return sd.findTeacherbyAll();

	}
	//����id��ѯ��ʦ��Ϣ
	public Teacher findTeacherByid(int teaid)
	{
		return sd.findStudentByid(teaid);
	}
	//�޸���ʦ��Ϣ
	public void UpdateTeacher(Teacher s)
	{
		sd.updateTeacher(s);
	}
	public Teacher loginCheck(String name,String password)
	{
		
		return sd.findStudentByNameAndPassword(name, password);
	}
	//�޸�����
	public void changePassword(Teacher s)
	{
		
		sd.changePassword(s);
	}
}