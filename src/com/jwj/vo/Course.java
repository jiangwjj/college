package com.jwj.vo;
/*
 * ¿Î³ÌÀà
 */
public class Course {
	private int courseid;
	private String coursename;
	private int stuid;
	private int teaid;
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
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public int getTeaid() {
		return teaid;
	}
	public void setTeaid(int teaid) {
		this.teaid = teaid;
	}
	public Course(int courseid, String coursename, int stuid, int teaid) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.stuid = stuid;
		this.teaid = teaid;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
