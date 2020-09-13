package com.jwj.vo;
/* ½ÌÊ¦Àà
 * 
 */
public class Teacher {
	private int teaid;
	private String teaname;
	private String teapassword;
	private String teagender;
	private int  courseid;
	private String email;
	private String phone;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teaid, String teaname, String teapassword,
			String teagender, int courseid) {
		super();
		this.teaid = teaid;
		this.teaname = teaname;
		this.teapassword = teapassword;
		this.teagender = teagender;
		this.courseid = courseid;
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
	public String getTeapassword() {
		return teapassword;
	}
	public void setTeapassword(String teapassword) {
		this.teapassword = teapassword;
	}
	public String getTeagender() {
		return teagender;
	}
	public void setTeagender(String teagender) {
		this.teagender = teagender;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
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
