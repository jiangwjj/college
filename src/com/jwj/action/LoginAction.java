package com.jwj.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.jwj.service.AdminService;
import com.jwj.service.TeacherService;
import com.jwj.vo.Admin;
import com.jwj.vo.Teacher;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * 用户登入
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;
	private String name;
	private String forwardview;// 跳转页面
	private Map<String, Object> session;
	private String verify;// 验证码
	private String Msg;
	private String type;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	// 用户登入
	public String logincheck() {

		String securityCode = (String) session.get("securityCode");

		if (type.equals("管理员")) {
			forwardview = "/login.jsp";
			if (null == new AdminService().adminLogin(name, password)) {

				Msg = "用户名或者密码错误";

				return INPUT;

			}
			if (null == verify || null == securityCode
					|| !securityCode.equals(verify)) 
				 {

					Msg = "验证码错误";
					return INPUT;
				} else {

					forwardview = "/Index.jsp";
					
					HttpSession session = ServletActionContext.getRequest()
							.getSession();
                    
					session.setAttribute("type", "1");
					return SUCCESS;
				}
			}
		if (type.equals("教师")) {
			forwardview = "/login.jsp";
			Teacher names=new TeacherService().loginCheck(name, password);
			if (null ==names) {

				Msg = "用户名或者密码错误";

				return INPUT;

			}
			if (null == verify || null == securityCode
					|| !securityCode.equals(verify)) 
				 {

					Msg = "验证码错误";
					return INPUT;
				} 
			else {

					forwardview = "/Index.jsp";
				
					HttpSession session = ServletActionContext.getRequest()
							.getSession();
                   session.setAttribute("names", names);
					session.setAttribute("type", "2");
					return SUCCESS;
				}
			}

		return null;
	
		}
	//退出系统
public String removes() {
		
		//清除session
	forwardview="/login.jsp";
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("names");
		
		return SUCCESS;
		
	}
		
	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getForwardview() {
		return forwardview;
	}

	public void setForwardview(String forwardview) {
		this.forwardview = forwardview;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
