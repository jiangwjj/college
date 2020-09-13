package com.jwj.service;

import java.util.List;

import com.jwj.dao.CourseDao;
import com.jwj.vo.Course;


/*
 *课程service
 */
public class CourseService {
	CourseDao sd = new CourseDao();
//添加课程
	public void addCourse(Course c) {
		sd.addCourse(c);
	}
//查询所以课程
	public Course findCourse(int courseid) {
		return sd.findCourseByid(courseid);

	}
	//修改课程
	public void updateCourse(Course c)
	{
		sd.UpdateCourse(c);
		
	}
	public List<Course> findCourseAll()
	{
		return sd.findAllCourse();
	}
	public void delCourseByid(int id)
	{
		sd.delCourseById(id);
	}
	
}
