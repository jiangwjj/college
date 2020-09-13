<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>课堂考勤管理系统</title>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="Style/Style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<center>
  <table width="900" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="60" bgcolor="#E6F5FF" style="color:#06F; font-size:19px; font-weight:bolder; padding-left:50px;">课堂考勤系统</td>
    </tr>
    <tr>
      <td height="30" background="Images/MenuBg.jpg">&nbsp;</td>
    </tr>
    <tr>
      <td height="500" align="center" valign="top"><table width="900" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="191" height="500" align="center" valign="top" background="Images/leftbg.jpg">
          <%@ include file="Left.jsp"%>
          </td>
          <td width="709" align="center" valign="top" bgcolor="#F6F9FE"><table width="709" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="30" background="Images/mainMenuBg.jpg" style="padding-left:25px;">学生管理</td>
            </tr>
            <tr>
              <td height="470" align="center" valign="top" bgcolor="#F6F9FE"><form name="form1" method="post" action="<%=basePath%>test/Student_findRandomId.action">
                <table width="100%%" border="0" cellspacing="0" cellpadding="0">
                
                  <tr>
                    <td width="28%" height="30" style="padding-left:20px;"> 功能导航：&nbsp;&nbsp;&nbsp;<input type="submit" value="随机抽查学生"><br></a></td>
                    <td width="72%">按班级查询: <select name="stuclass" >
                      <option value="">请选择</option>
                      <option value="1">13级软件1班</option>
                        <option value="2">13级软件2班</option>
                      </select></td>
                      
                  </tr>
                  <tr>
                    <td width="28%" height="30" style="padding-left:20px;"> 
                    <td width="72%">按课程查询: <select name="stuclass" >
                      <option value="">请选择</option>
                      <option value="javaweb">javaweb</option>
                        <option value="c++">c++</option>
                      </select></td>
                      
                  
                </table>
              
                     
              </form>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr align="center"  class="t1">
                    <td height="25" bgcolor="#D5E4F4">
                    <strong>学号</strong></td>
                    <td bgcolor="#D5E4F4"><strong>姓名</strong></td>
                    <td bgcolor="#D5E4F4"><strong>性别</strong></td>
                    <td bgcolor="#D5E4F4"><strong>迟到</strong></td>
                    <td bgcolor="#D5E4F4"><strong>旷课</strong></td>
                    <td bgcolor="#D5E4F4"><strong>班级</strong></td>
                    <td bgcolor="#D5E4F4"><strong>老师</strong></td>
                        <td bgcolor="#D5E4F4"><strong>课程</strong></td>
                    
                    <td bgcolor="#D5E4F4"><strong>操作</strong></td>
                  </tr>
                  
                    <tr align="center">
                       <td height="25" align="center">${all.stuid}</td>
                       <td>${all.stuname}</td>
                       <td>${all.stugender}</td>
                       <td>${all.late}</td>
                       <td>${all.stuout}</td>
                       <td>${all.stuclass}</td>
                       <td>${all.teaname}</td>
                       <td>${all.coursename}</td>
                     
                      <td align="center"><a href="<%=basePath %>test/Student_updateStudent.action?teaid=${student.stuid}">修改</a> <a href="<%=basePath %>test/Teacher_delTeacher.action?teacher.teaid=${teacher.teaid}" onClick="return confirm('确定要删除该教师吗？')">删除</a></td>
                    </tr>
                 
                </table>
          </table></td>
        </tr>
      </table></td>
    </tr>
    <tr>
      <td height="35" background="Images/bootBg.jpg">&nbsp;</td>
    </tr>
  </table>
	
</body>
</html>
