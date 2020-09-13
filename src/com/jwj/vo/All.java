package com.jwj.vo;
//ËùÒÔµÄvo
public class All {
    private String studate;
	private String stuname;
	private String stugender;
	private String stuclass;
	private int late;
	private int stuout;
	private int courseid;
	private String coursename;
	private int stuid;
	private int teaid;
	private String teaname;
	private String teapassword;
	private String teagender;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStugender() {
		return stugender;
	}
	public void setStugender(String stugender) {
		this.stugender = stugender;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}
	public int getLate() {
		return late;
	}
	public void setLate(int late) {
		this.late = late;
	}
	public int getStuout() {
		return stuout;
	}
	public void setStuout(int stuout) {
		this.stuout = stuout;
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
	public String getStudate() {
		return studate;
	}
	public void setStudate(String studate) {
		this.studate = studate;
	}
	public All() {
		super();
		// TODO Auto-generated constructor stub
	}
	public All(String stuname, String stugender, String stuclass, int late,
			int stuout, int courseid, String coursename, int stuid, int teaid,
			String teaname, String teapassword, String teagender) {
		super();
		this.stuname = stuname;
		this.stugender = stugender;
		this.stuclass = stuclass;
		this.late = late;
		this.stuout = stuout;
		this.courseid = courseid;
		this.coursename = coursename;
		this.stuid = stuid;
		this.teaid = teaid;
		this.teaname = teaname;
		this.teapassword = teapassword;
		this.teagender = teagender;
	}
	

}
