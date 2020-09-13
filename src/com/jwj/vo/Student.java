package com.jwj.vo;
/*
 * Ñ§ÉúÀà
 */
public class Student {
private int stuid;
private String stuname;
private String stugender;
private String stuclass;
private int late;
private int stuout;
private int account;
private int teaid;
private String studate;



public String getStudate() {
	return studate;
}
public void setStudate(String studate) {
	this.studate = studate;
}
public int getStuid() {
	return stuid;
}
public int getAccount() {
	return account;
}
public void setAccount(int account) {
	this.account = account;
}
public void setStuid(int stuid) {
	this.stuid = stuid;
}
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
public String getStuclass() {
	return stuclass;
}
public void setStuclass(String stuclass) {
	this.stuclass = stuclass;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int stuid, String stuname, String stugender, String stuclass,
		int late, int stuout, int couid) {
	super();
	this.stuid = stuid;
	this.stuname = stuname;
	this.stugender = stugender;
	this.late = late;
	this.stuout = stuout;
	this.stuclass=stuclass;
	
}
public int getTeaid() {
	return teaid;
}
public void setTeaid(int teaid) {
	this.teaid = teaid;
}




}
