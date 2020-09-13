package com.jwj.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jwj.db.Utils;

import com.jwj.vo.Teacher;


public class TeacherDao {
	/*
	 * 老师dao
	 */
	QueryRunner qr = new QueryRunner();
Teacher a = null;
	List<Teacher> list = null;

	// 添加老师
	public void addTeacher(Teacher s) {
		String sql = "insert into teacher(teaid,teaname,teagender,email,phone)values(?,?,?,?,?)";
		try {
			qr.update(Utils.getConnection(), sql,s.getTeaid(),s.getTeaname(),s.getTeagender(),s.getEmail(),s.getPhone());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 根据id删除老师
	public void delTeacherById(int teaid) {
		String sql = "delete from Teacher where teaid=?";
		try {
			qr.update(Utils.getConnection(), sql, teaid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	// 根据id查询老师信息
	public Teacher findStudentByid(int teaid) {
		String sql = "select * from Teacher where teaid=?";
		try {
			a = qr.query(Utils.getConnection(), sql, new BeanHandler<Teacher>(
					Teacher.class), teaid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	
//查询所有老师信息
	public List<Teacher> findTeacherbyAll() {

		String sql = "select * from Teacher";
		try {
			list = qr.query(Utils.getConnection(), sql,
					new BeanListHandler<Teacher>(Teacher.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	//查询老师姓名和密码
	public Teacher findStudentByNameAndPassword(String name,String password) {
		String sql = "select teaname,teapassword,teaid from teacher where teaname=? and teapassword=?";
		try {
			a = qr.query(Utils.getConnection(), sql, new BeanHandler<Teacher>(Teacher.class), name,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	//修改老师
	public void updateTeacher(Teacher s) {
		String sql = "update teacher set teaname=?,teagender=?,email=?,phone=? where teaid=?";
		try {
			qr.update(Utils.getConnection(), sql,s.getTeaname(),s.getTeagender(),s.getEmail(),s.getPhone(),s.getTeaid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//修改老师密码
	public void changePassword(Teacher t)
	{
		String sql="update teacher set teapassword=? where teaid=?";
		try {
			qr.update(Utils.getConnection(), sql, t.getTeapassword(),t.getTeaid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
