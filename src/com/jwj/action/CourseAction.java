package com.jwj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.jwj.service.CourseService;
import com.jwj.vo.Course;
import com.opensymgfgfdphony.xwork2.ActionSupport;

<<<<<<< HEAD
//修改 java 代码，测试 提交 1111 任务
=======
//�޸� java ���룬���� �ύdfs
>>>>>>> a45a03480c880e8f9caa53646e8a2cdce4a2076a
public class CourseAction extends ActionSupport {

	/**
	 * 课程action
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int courseid;
	private String coursename;
	private String forwardview;
	private String Msg;
private String Msg;
	Course course=new Course();
               private String Msg;


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	// 添加课程
	public String addCourse() {
		if (cs.findCourse(courseid) == null) {
       
			c.setCourseid(courseid);
			c.setCoursename(coursename);
			cs.addCourse(c);
			List<Course> list = null;
			HttpServletRequest request = ServletActionContext.getRequest();
			forwardview = "/CourseManager.jsp";
			list = cs.findCourseAll();
			request.setAttribute("list", list);
			

	Course c = new Course();
	CourseService cs = new CourseService();

	// 添加课程
	public String addCourse() {
		if (cs.findCourse(courseid) == null) {
       
			c.setCourseid(courseid);
			c.setCoursename(coursename);
			cs.addCourse(c);
			List<Course> list = null;
			HttpServletRequest request = ServletActionContext.getRequest();
			forwardview = "/CourseManager.jsp";
			list = cs.findCourseAll();
			request.setAttribute("list", list);
			
			
			
			@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
		// list  fdsfa fdsi
	}
		  //ceshi ef
			return SUCCESS;
		} else {
			forwardview = "/AddCourse.jsp";
			Msg = "课程id已经存在";
			return INPUT;
		}
	}

	// 删除课程
	public String delCourse() {
		List<Course> list = null;
		HttpServletRequest request = ServletActionContext.getRequest();
		forwardview = "/CourseManager.jsp";
		cs.delCourseByid(courseid);
		list = cs.findCourseAll();
		request.setAttribute("list", list);
		
		return SUCCESS;

	}

	// 根据id查询课程
	public String findCourseById() {

		cs.findCourse(courseid);

		
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("course", cs.findCourse(courseid));
		forwardview = "/CourseUpdate.jsp";

		return SUCCESS;

	}

	// 修改课程
	public String updateCourse() {

	
		System.out.println("courseid=============="+courseid);
		System.out.println("coursename=============="+coursename);
		course.setCourseid(courseid);
		course.setCoursename(coursename);
		cs.updateCourse(course);
		List<Course> list = null;
		HttpServletRequest request = ServletActionContext.getRequest();
		forwardview = "/CourseManager.jsp";
		list = cs.findCourseAll();
		request.setAttribute("list", list);	
		return SUCCESS;

	}

	// 查询所有课程
	public String findAllCourse() {
		List<Course> list = null;
		HttpServletRequest request = ServletActionContext.getRequest();
		forwardview = "/CourseManager.jsp";
		list = cs.findCourseAll();
		request.setAttribute("list", list);
		return SUCCESS;

	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getForwardview() {
		return forwardview;
	}

	public void setForwardview(String forwardview) {
		this.forwardview = forwardview;
	}

}
