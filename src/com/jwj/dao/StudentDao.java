                               package com.jwj.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.jwj.db.Utils;
import com.jwj.vo.All;
import com.jwj.vo.PageBean;
import com.jwj.vo.Student;
import com.jwj.vo.Teacher;

public class StudentDao {
	/*
	 * 学生dao
	 */
	QueryRunner qr = new QueryRunner();
	All a = null;
	List<Student> list = null;
	Student s = null;

	//管理员添加学生
	public void addStudent(Student s) {
		String sql = "insert into student(stuid,stuname,stugender,stuclass)values(?,?,?,?)";
		try {
			qr.update(Utils.getConnection(), sql, s.getStuid(),s.getStuname(),
					s.getStugender(), s.getStuclass());
		} catch (SQLException e) {
			// TODO Auto-generated catch block                                
			e.printStackTrace();
		}
	}

	// 管理员根据id删除学生
	public void delStudentById(int stuid) {
		String sql = "delete  from student where stuid=?";
		try {
			qr.update(Utils.getConnection(), sql, stuid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 管理员修改学生
	public void updateStudent(Student s) {
		String sql = "update student set stuname=?,stugender=?,stuclass=? where stuid=?";
		try {
			qr.update(Utils.getConnection(), sql, s.getStuname(), s.getStugender(),
					s.getStuclass(),s.getStuid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//教师端修改学生
	
	public void updateStudentByteacher(Student s) {
		String sql = "update student set stuout=?,late=?,studate=? where stuid=?";
		try {
			qr.update(Utils.getConnection(), sql, s.getStuout(),s.getLate(),s.getStudate(),s.getStuid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// 根据id查询学生信息
	/*
	 * public All findStudentByid(int stuid) { String sql =
	 * "select * from student,course,teacher where student.couid=course.couid and course.couid=teacher.couid and stuid=?"
	 * ; try { a = qr.query(Utils.getConnection(), sql, new BeanHandler<All>(
	 * All.class), stuid); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } return a; }
	 */
	//// 根据课程查询所有的总数
	public List<Student> findAll() {
		String sql = "select * from Student";
		try {
			list = qr.query(Utils.getConnection(), sql,
					new BeanListHandler<Student>(Student.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	
//查询所有迟到旷课的学生
	public List<All> findStudentAllByt() { 
		List<All> list=null;
		 String sql ="select * from student,course,teacher where student.courseid=course.courseid and " +
		 		"course.courseid=teacher.courseid and(stuout is not null or late is not null)";
		 try {
			list=qr.query(Utils.getConnection(), sql, new BeanListHandler<All>(All.class));
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return list;
		
	
	}
	
	

	// 根据班级,和课程查询有迟到旷课信息
	public List<All> findStudentByClass(String stuclass,String coursename) { 
		List<All> list=null;
		 String sql ="select * from student,course,teacher where student.courseid=course.courseid and " +
		 		"course.courseid=teacher.courseid and(stuout is not null or late is not null)and stuclass=? and coursename=?";
		 try {
			list=qr.query(Utils.getConnection(), sql, new BeanListHandler<All>(All.class),stuclass,coursename);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return list;
		
	
	}
	//管理员根据id查询学生
	public Student findStudentById(int stuid)
	{
		String sql="select * from student where stuid=?";
		try {
			s=qr.query(Utils.getConnection(), sql, new BeanHandler<Student>(Student.class),stuid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	//根据id随机查询的学生
	public int studentRandomId(String stuclass)
	{	 String sql="select count(*) from student where stuclass=?";
		Number num;
		int ran=0;
		try {
			num = (Number)qr.query(Utils.getConnection(), sql,new ScalarHandler<Long>(),stuclass);
			 ran= num.intValue();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ran;
		
	}
	//教师端查询id学生信息
	public All findStudentByteacher(int stuid)
	
	{
		All all=null;
		String sql = "select * from student,course,teacher where student.courseid=course.courseid" +
				" and course.courseid=teacher.courseid and student.stuid=? ";
		   try {
		all=qr.query(Utils.getConnection(), sql, new BeanHandler<All>(All.class),stuid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return all;
		   
	}
}
