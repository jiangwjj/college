package com.jwj.service;

import java.util.List;

import com.jwj.dao.CourseDao;
import com.jwj.vo.Course;


/*
 *�γ�service
 */
public class CourseService {
	CourseDao sd = new CourseDao();
//���ӿγ�
	public void addCourse(Course c) {
		sd.addCourse(c);
	}
//��ѯ���Կγ�
	public Course findCourse(int courseid) {
		return sd.findCourseByid(courseid);

	}
	//�޸Ŀγ�
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