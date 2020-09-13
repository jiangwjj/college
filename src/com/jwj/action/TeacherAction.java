package com.jwj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


import com.jwj.service.TeacherService;

import com.jwj.vo.Teacher;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class TeacherAction extends ActionSupport 
		 {

	/**
	 * 教师端
	 */
	TeacherService ts = new TeacherService();

	private static final long serialVersionUID = 1L;
	private int teaid;
	private String teaname;
	private String teagender;
	private String forwardview;
	private  String teapassword;
	private String email;
	private String phone;
	
	private String Msg;
	Teacher teacher=new Teacher() ;
	List<Teacher> list=null;
	

	



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
//增加老师
	public String addTeacher() {
		//创建session对象
				
		if (ts.findTeacherByid(teaid) != null)

		{ forwardview = "/TeacherAdd.jsp";
			Msg="用户id重复";
			return INPUT;
		}
		else
		{ System.out.println("gender========================"+teagender);
		forwardview="/TeacherManager.jsp";
			teacher.setTeaid(teaid);
			teacher.setTeaname(teaname);
			teacher.setTeagender(teagender);
			teacher.setEmail(email);
			teacher.setPhone(phone);
			
			 ts.addTeacher(teacher);
			 HttpServletRequest request=ServletActionContext.getRequest();
				forwardview="/TeacherManager.jsp";
				list=ts.findByAllTeacher();
				request.setAttribute("list", list);
			
			return SUCCESS;
		}
	}
	//删除老师
	public String delTeacher()
	{  
		
		Msg="删除成功";
		ts.delTeacher(teaid);
		if(ts.findTeacherByid(teaid)==null)
		{forwardview = "/TeacherManager.jsp";
		HttpServletRequest request=ServletActionContext.getRequest();
		list=ts.findByAllTeacher();
		request.setAttribute("list", list);
		return SUCCESS;
		}
		else
		{ 	HttpServletRequest request=ServletActionContext.getRequest();
		 list=ts.findByAllTeacher();
		  request.setAttribute("list", list);
			forwardview="/TeacherManager.jsp";
			Msg="删除失败";
			return INPUT;
			
		}
		
	}
	//查询所有老师
	public String FindAllTeacher()
	{   
		HttpServletRequest request=ServletActionContext.getRequest();
		forwardview="/TeacherManager.jsp";
		list=ts.findByAllTeacher();
		request.setAttribute("list", list);
	return SUCCESS;
		
	}
	//修改老师
	public String UpdateTeacher()
	{  

		Msg="修改成功";
		 forwardview = "/TeacherManager.jsp";
		 teacher.setTeaid(teaid);
			teacher.setTeaname(teaname);
			teacher.setTeagender(teagender);
			teacher.setEmail(email);
			teacher.setPhone(phone);
			ts.UpdateTeacher(teacher);
			HttpServletRequest request=ServletActionContext.getRequest();
			list=ts.findByAllTeacher();
			request.setAttribute("list", list);
		return SUCCESS;
		
	
	
	}
	public String findUpTeacherById()
	{
	
	teacher = ts.findTeacherByid(teaid);
	

		forwardview="/TeacherUpdate.jsp";
	
		 HttpServletRequest request=ServletActionContext.getRequest();
		 request.setAttribute("teacher", teacher);
		 return SUCCESS;
	
	}
	
	public String findTeacherById()
	{
	
	teacher = ts.findTeacherByid(teaid);
	if (teacher == null) {
		Msg="对不起没有查到此人";
		forwardview="/findNoPerson.jsp";
		
		return INPUT;
	} else {
		forwardview="/findStuidView.jsp";
	
		 HttpServletRequest request=ServletActionContext.getRequest();
		 request.setAttribute("teacher", teacher);
		 return SUCCESS;
	}	
	}
	//修改密码
	public String changeTeacherPassword()
	{
		forwardview="/updateSuccess.jsp";
				teacher.setTeaid(teaid);
		        teacher.setTeapassword(teapassword);
		        ts.changePassword(teacher);
		        return SUCCESS;
		
	}
	public String getTeapassword() {
		return teapassword;
	}

	public void setTeapassword(String teapassword) {
		this.teapassword = teapassword;
	}


	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}
	
	public String getForwardview() {
		return forwardview;
	}

	public void setForwardview(String forwardview) {
		this.forwardview = forwardview;
	}

	public int getTeaid() {
		return teaid;
	}

	public void setTeaid(int teaid) {
		this.teaid = teaid;
	}

	public String getTeaname() {
		return teaname;
	}

	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}

	public String getTeagender() {
		return teagender;
	}

	public void setTeagender(String teagender) {
		this.teagender = teagender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
