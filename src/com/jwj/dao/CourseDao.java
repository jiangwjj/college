package com.jwj.dao;

import java.sql.SQLException;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.jwj.db.Utils;
import com.jwj.vo.Course;
/*
 * �γ�dao
 */
import com.jwj.vo.Teacher;


public class CourseDao {
 QueryRunner qr= new QueryRunner();
 Course c=null;
 List<Course> list=null;
 //���ӿγ�
 public void addCourse(Course c) {
		String sql = "insert into course(courseid,coursename)values(?,?)";
		try {
			qr.update(Utils.getConnection(), sql,c.getCourseid(),c.getCoursename());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 //����id��ѯ�γ�
 public Course findCourseByid(int courseid) {
		String sql = "select * from course where courseid=?";
		try {
			c = qr.query(Utils.getConnection(), sql, new BeanHandler<Course>(
					Course.class), courseid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
 //���¿γ�
 public void UpdateCourse(Course c) {
		String sql = "update course set coursename=? where courseid=?";
		try {
			qr.update(Utils.getConnection(), sql,c.getCoursename(),c.getCourseid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 //��ѯ���пγ�
 public List<Course>findAllCourse()
 {
	 String sql = "select * from course";
		try {
			list = qr.query(Utils.getConnection(), sql,
					new BeanListHandler<Course>(Course.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list; 
	 
 }
 public void delCourseById(int id)
 {
	 String sql="delete from course where courseid=?";
	 try {
		qr.update(Utils.getConnection(), sql,id);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
 
}