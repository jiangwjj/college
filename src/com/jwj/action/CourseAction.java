package com.jwj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.jwj.service.CourseService;
import com.jwj.vo.Course;
import com.opensymphony.xwork2.ActionSupport;

public class CourseAction extends ActionSupport {

	/**
	 * �γ�action
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int courseid;
	private String coursename;
	private String forwardview;
	private String Msg;
	Course course=new Course();


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	Course c = new Course();
	CourseService cs = new CourseService();

	// ���ӿγ�
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
			return SUCCESS;
		} else {
			forwardview = "/AddCourse.jsp";
			Msg = "�γ�id�Ѿ�����";
			return INPUT;
		}
	}

	// ɾ���γ�
	public String delCourse() {
		List<Course> list = null;
		HttpServletRequest request = ServletActionContext.getRequest();
		forwardview = "/CourseManager.jsp";
		cs.delCourseByid(courseid);
		list = cs.findCourseAll();
		request.setAttribute("list", list);
		
		return SUCCESS;

	}

	// ����id��ѯ�γ�
	public String findCourseById() {

		cs.findCourse(courseid);

		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("course", cs.findCourse(courseid));
		forwardview = "/CourseUpdate.jsp";

		return SUCCESS;

	}

	// �޸Ŀγ�
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

	// ��ѯ���пγ�
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