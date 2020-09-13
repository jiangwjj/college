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
      <td height="60" bgcolor="#E6F5FF" style="color:#06F; font-size:19px; font-weight:bolder; padding-left:50px;">课堂考勤管理系统</td>
    </tr>
    <tr>
      <td height="30" background="Images/MenuBg.jpg">&nbsp;</td>
    </tr>
    <tr>
      <td height="500" align="center" valign="top"><table width="900" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="191" height="500" align="center" valign="top" background="Images/leftbg.jpg">t<%@ include file="Left.jsp"%>
          </td>
          <td width="709" align="center" valign="top" bgcolor="#F6F9FE"><table width="709" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="30" background="Images/mainMenuBg.jpg" style="padding-left:25px;">教师管理&nbsp;&nbsp; 欢迎你：${name}</td>
            </tr>
            <tr>
              <td height="470" align="center" valign="top" bgcolor="#F6F9FE"><form name="form1" method="post" action="<%=basePath %>test/Teacher_findTeacherById.action">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                
                  <tr>
                    <td width="28%" height="30" style="padding-left:20px;"> 功能导航： <a href="TeacherAdd.jsp">添加教师</a></td>
                    <td width="72%">根据id查询：
                      <input name="teaid" type="text" class="text1" >
                      <input type="submit" name="button" id="button" value="点击查询"></td>
                  </tr>
                </table>
              </form>
               <form action="<%=basePath %>test/Teacher_FindAllTeacher.action" method="post">  <table align="left"><tr>
               <td style="padding-left:20px;">
               <input type="submit" name="button" id="button" value="查询所有老师信息"></td>
               </tr>
               </table></form>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr align="center"  class="t1">
                    <td height="25" bgcolor="#D5E4F4"><strong>教师id</strong></td>
                    <td bgcolor="#D5E4F4"><strong>姓名</strong></td>
                    <td bgcolor="#D5E4F4"><strong>性别</strong></td>
                     <td bgcolor="#D5E4F4"><strong>电子邮件</strong></td>
                      <td bgcolor="#D5E4F4"><strong>电话号码</strong></td>
                    <td bgcolor="#D5E4F4"><strong>操作</strong></td>
                  </tr>
                 	<c:forEach items="${list}" var="list">
                    <tr align="center">
                      <td height="25" align="center">${list.teaid}</td>
                      <td>${list.teaname}</td>
                      <td>${list.teagender=="1"?"男":"女"}</td>
                      <td>${list.email}</td>
                      <td>${list.phone}</td>
                      
                      <td align="center"><a href="<%=basePath %>test/Teacher_findUpTeacherById.action?teaid=${list.teaid}">修改</a> <a href="<%=basePath %>test/Teacher_delTeacher.action?teaid=${list.teaid}" onClick="return confirm('确定要删除该教师吗？')">删除</a></td>
                    </tr>
        </c:forEach>
                </table></td>
            </tr>
          </table></td>
        </tr>
      </table></td>
    </tr>
    <tr>
      <td height="35" background="Images/bootBg.jpg">&nbsp;</td>
    </tr>
  </table>

</center>
</body>
</html>
