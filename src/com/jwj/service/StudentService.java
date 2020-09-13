package com.jwj.service;

import java.util.List;

import com.jwj.dao.StudentDao;
import com.jwj.vo.All;
import com.jwj.vo.PageBean;
import com.jwj.vo.Student;

/*
 * 学生service
 */
public class StudentService {
	StudentDao sd = new StudentDao();

	// 添加学生
	public void addStudent(Student s) {
		sd.addStudent(s);
	}

	// 删除学生
	public void delStudent(int stuid) {
		sd.delStudentById(stuid);

	}

	// 修改学生
	public void AlterStudent(Student s) {     
		sd.updateStudent(s);

	}

	// 管理员端查询学生
	public Student findStudentById(int stuid) {
		return sd. findStudentById(stuid);

	}
//随机 抽取学生
	public int findRandomId(String stuclass) {

		return sd.studentRandomId(stuclass);
	}

	// 根据课程查询迟到旷课的学生

	public List<Student> findStudentAll() {
		return sd.findAll();
	}

	// 根据班级查询查到旷课的学生
	//public PageBean<All> findStudentByClass(int pc, int ps, String stuclass) {
		//return sd.findAll(pc, ps, stuclass);
	//}
	
	//教师端修改更新旷课的学生
	public void updateStudentByTeacher(Student s)
	{
		
		sd.updateStudentByteacher(s);
	}
	//教师端查询学生信息
 public All findStudentByteacher(int stuid)
 {
	 return sd.findStudentByteacher(stuid);
	 
	 
 }
	//教师端根据班级和课程查询学生迟到或旷课的学生
 public List<All> findStudentByClassAndCourseName(String stucalss,String coursename)
 {
	 return sd.findStudentByClass(stucalss,coursename);
 }
//查询你所有的迟到款可的学生
 public List<All>  findStudentAllByteacher()
 { 
	 
	 return sd.findStudentAllByt();
 }
}	
	

