package com.jwj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import com.jwj.service.StudentService;
import com.jwj.vo.All;
import com.jwj.vo.PageBean;
import com.jwj.vo.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String stu;
	private String type;
	private String studatewww;
	private String Msg;
	private int stuid;
	private String stuname;
	private String stugender;
	private String stuclass;
	private int late;
	private int stuout;
	private int courseid;
	private String coursename;
	private int teaid;
	private String teaname;
	private String teapassword;
	private String teagender;
	private String forwardview;
	 Student student = new Student();
	 All all=new All();


	StudentService ss = new StudentService();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	// 管理员增加学生
	public String addStudent() {

		if (new StudentService().findStudentById(stuid) == null) {
			student.setStuid(stuid);
			student.setStuclass(stuclass);
			student.setStugender(stugender);
			student.setStuname(stuname);

		
			new StudentService().addStudent(student);
			forwardview = "/adminStudentManager.jsp";

			List<Student> list = new StudentService().findStudentAll();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("list", list);
			return SUCCESS;
		} else {
			Msg = "该学号已经存在";
			forwardview = "/addStudent.jsp";
			return INPUT;
		}
	}

	// 教师端修改学生
	/*public String updateStudent() {
		student.setLate(late);
		student.setStuout(stuout);
		new StudentService().AlterStudent(student);
		forwardview = "/StudentManger.jsp";
		return SUCCESS;
		

	}*/

	// 根据班级随机抽查学生

	public String findRandomId()

	{
		int randomnum = 0;
		HttpServletRequest request = ServletActionContext.getRequest();

		if (type.equals("1")) {

			int amountnum = new StudentService().findRandomId(type);
			int i = (int) (Math.random() * amountnum);
			randomnum = 20131001 + i;
			forwardview = "/studentRandom.jsp";
			System.out.println(randomnum + "^^^" + i);
			Student s = null;
			s = new StudentService().findStudentById(randomnum);
			request.setAttribute("s", s);

			return SUCCESS;

		}

		if (type.equals("2")) {
			forwardview = "/studentRandom.jsp";

			int amountnum = new StudentService().findRandomId(type);
			int i = (int) (Math.random() * amountnum);
			Student s = null;
			randomnum = 20132001 + i;
			System.out.println(randomnum + "^^^" + i);
			s = new StudentService().findStudentById(randomnum);
			

			request.setAttribute("s", s);
			return SUCCESS;

		}

		return null;

	}

	// 教师跟新与保存学生记录
	public String calcuateOfStudentTotal() {
		
		
		if ("2".equals(stu)) {
			Student student = new Student();
			Msg = "修改成功";
			student.setStuid(stuid);
			student.setLate(0);
			student.setStuout(0);
			student.setStudate(studatewww);
			
			System.out.println("studate=========================" +studatewww);

			System.out.println("studate=========================" +studatewww);

			System.out.println("studate=========================" +studatewww);

			System.out.println("studate=========================" +studatewww);

			System.out.println("studate=========================" +studatewww);
			
			
			new StudentService().updateStudentByTeacher(student);
			
			All all= ss.findStudentByteacher(stuid);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("all", all);
			
			forwardview = "/changeStudentByRandom.jsp";
			return SUCCESS;
		}
		
		
		if ("0".equals(stu)) {
			Msg = "添加成功";

			Student student = new Student();
			student.setStuid(stuid);
			student.setLate(1);
			student.setStuout(0);
			student.setStudate(studatewww);
			new StudentService().updateStudentByTeacher(student);
			All all= ss.findStudentByteacher(stuid);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("all", all);
			forwardview = "/changeStudentByRandom.jsp";
			return SUCCESS;
		}
		if ("1".equals(stu)) {
			Msg = "添加成功";

			student.setStuid(stuid);
			student.setLate(0);
			student.setStuout(1);
			student.setStudate(studatewww);

			new StudentService().updateStudentByTeacher(student);
			All all= ss.findStudentByteacher(stuid);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("all", all);
			forwardview = "/changeStudentByRandom.jsp";
			return SUCCESS;
		}
	
		return null;
	}

	// 管理员端 查询所有学生信息
	public String findStudentAll() {
		forwardview = "/adminStudentManager.jsp";

		List<Student> list = new StudentService().findStudentAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list", list);
		return SUCCESS;

	}

	// 根据班级查询所有信息
	/*
	 * public String findStudentByClass() { forwardview = "StudentManager"; int
	 * pc = 0; int ps = 10; PageBean<All> students = new
	 * StudentService().findStudentByClass(pc, ps, all.getStuclass());
	 * HttpServletRequest request = ServletActionContext.getRequest();
	 * request.setAttribute("students", students); return SUCCESS;
	 * 
	 * }
	 */
	// 管理员端根据学号查询学生信息

	public String findStudentbyId() {
		HttpServletRequest request = ServletActionContext.getRequest();
		if (ss.findStudentById(stuid) != null) {

			forwardview = "/adminstudentUpdate.jsp";
			request.setAttribute("student", ss.findStudentById(stuid));
			return SUCCESS;

		} else {
			forwardview = "/findNoPerson.jsp";
			return INPUT;
		}
	}

	// 管理员修改学生信息
	public String updatefindStudentbyId() {
		student.setStuid(stuid);
		student.setStugender(stugender);
		student.setStuclass(stuclass);
		student.setStuname(stuname);
		ss.AlterStudent(student);
		forwardview = "/adminStudentManager.jsp";

		List<Student> list = new StudentService().findStudentAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list", list);
		return SUCCESS;
	}

	// 删除学生
	public String delStudent() {
		System.out.println("name======================" + stuid);
		
		ss.delStudent(stuid);
		forwardview = "/adminStudentManager.jsp";

		List<Student> list = new StudentService().findStudentAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list", list);
		return SUCCESS;

	}

	// 教师端根据id查询学生
	public String findStudentByteacher() {
		 all = ss.findStudentByteacher(stuid);
		if (all != null) {

			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("all", all);
			forwardview = "/changeStudentByRandom.jsp";
			return SUCCESS;

		} else {
			Msg = "查无此人";
			forwardview = "/changeStudentByRandom.jsp";
			System.out.println("stuid===================" + stuid);
			return INPUT;

		}

	}
//查看修改类容
	public String teacherUpdateStudentByidView() {

		student = ss.findStudentById(stuid);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("student", student);
		forwardview = "/studentUpdate.jsp";
		
		return SUCCESS;
	}
	public String allTeacherUpdateStudentByidView() {

	All all= ss.findStudentByteacher(stuid);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", all);
		forwardview = "/allStudentUpdate.jsp";
		return SUCCESS;
	}
	// 教师更新学生
	/*public String teacherUpdateStudentByid() {
		forwardview = "/updateSuccess.jsp";
		student.setLate(late);
		student.setStuout(stuout);
		ss.updateStudentByTeacher(student);
		return SUCCESS;

	}*/
//根据班级和课程查询迟到或者旷课的学生
	public String findStudentByClassAndCourseName()
	{ 
		
	forwardview="/StudentManager.jsp";	
	List<All> list=ss.findStudentByClassAndCourseName(stu, type);
	HttpServletRequest request=ServletActionContext.getRequest();

	System.out.println("class========================"+stu);
	System.out.println("type========================"+type);	
	request.setAttribute("list", list);
		return SUCCESS;
	

	}
	//管理员批量删除学生
	public String delMultiStudent()
	{ forwardview="/adminStudentManager.jsp";
		HttpServletRequest request=ServletActionContext.getRequest();
		String ids[] = request.getParameterValues("ids");
		if(ids!=null&&ids.length>0){
			for(String stuid:ids){
				ss.delStudent(Integer.parseInt(stuid));
			}
		}
		
		List<Student> list = new StudentService().findStudentAll();
		request.setAttribute("list", list);
		return forwardview;
		
	
	}


	public String getStudatewww() {
		return studatewww;
	}

	public void setStudatewww(String studate) {
		this.studatewww = studate;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public int getStuid() {
		return stuid;
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

	public String getStu() {
		return stu;
	}

	public void setStu(String stu) {
		this.stu = stu;
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

	public String getForwardview() {
		return forwardview;
	}

	public void setForwardview(String forwardview) {
		this.forwardview = forwardview;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}