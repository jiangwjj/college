package com.jwj.service;

import java.util.List;

import com.jwj.dao.StudentDao;
import com.jwj.vo.All;
import com.jwj.vo.PageBean;
import com.jwj.vo.Student;

/*
 * ѧ��service
 */
public class StudentService {
	StudentDao sd = new StudentDao();

	// ����ѧ��
	public void addStudent(Student s) {
		sd.addStudent(s);
	}

	// ɾ��ѧ��
	public void delStudent(int stuid) {
		sd.delStudentById(stuid);

	}

	// �޸�ѧ��
	public void AlterStudent(Student s) {     
		sd.updateStudent(s);

	}

	// ����Ա�˲�ѯѧ��
	public Student findStudentById(int stuid) {
		return sd. findStudentById(stuid);

	}
//��� ��ȡѧ��
	public int findRandomId(String stuclass) {

		return sd.studentRandomId(stuclass);
	}

	// ���ݿγ̲�ѯ�ٵ����ε�ѧ��

	public List<Student> findStudentAll() {
		return sd.findAll();
	}

	// ���ݰ༶��ѯ�鵽���ε�ѧ��
	//public PageBean<All> findStudentByClass(int pc, int ps, String stuclass) {
		//return sd.findAll(pc, ps, stuclass);
	//}
	
	//��ʦ���޸ĸ��¿��ε�ѧ��
	public void updateStudentByTeacher(Student s)
	{
		
		sd.updateStudentByteacher(s);
	}
	//��ʦ�˲�ѯѧ����Ϣ
 public All findStudentByteacher(int stuid)
 {
	 return sd.findStudentByteacher(stuid);
	 
	 
 }
	//��ʦ�˸��ݰ༶�Ϳγ̲�ѯѧ���ٵ�����ε�ѧ��
 public List<All> findStudentByClassAndCourseName(String stucalss,String coursename)
 {
	 return sd.findStudentByClass(stucalss,coursename);
 }
//��ѯ�����еĳٵ���ɵ�ѧ��
 public List<All>  findStudentAllByteacher()
 { 
	 
	 return sd.findStudentAllByt();
 }
}	
	
