<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>课堂考勤管理系统</title>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="Style/Style.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript">
  	
  		function delMulti(){
			var stuids = document.getElementsByName("ids");//数组
			//alert(idsObj.length);
			var selected = false;//是否选择了
			for(var i=0;i<stuids.length;i++){
				if(idsObj[i].checked){
					selected=true;
					break;
				}
			}
			if(selected){
					//选择了
				var sure = window.confirm("确定要删除吗？");
				if(sure){
					document.getElementById("f1").submit();//提交表单
				}
			}else{
				alert("请先选择要删除的记录");
			}
  		}
  	</script>
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
          <td width="191" height="500" align="center" valign="top" background="Images/leftbg.jpg">
          <%@ include file="Left.jsp"%>
          </td>
          <td width="709" align="center" valign="top" bgcolor="#F6F9FE"><table width="709" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="30" background="Images/mainMenuBg.jpg" style="padding-left:25px;">学生信息管理&nbsp;&nbsp;欢迎你：${name}管理员</td>
            </tr>
            <tr>
              <td height="470" align="center" valign="top" bgcolor="#F6F9FE">
                <table width="100%%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                  <form id="f1" action="<%=basePath %>test/Student_delMultiStudent.action" method="post">
                    <td width="28%" height="30" style="padding-left:20px;"> 功能导航： <a href="studentAdd.jsp">添加学生</a>&nbsp;&nbsp;
                    <a href="javascript:delMulti()">删除</a></td>
                      </form>
                      
                      <form action="<%=basePath %>test/Student_findStudentAll.action" method="post">
                    <td width="72%">
             <input type="submit" name="button" id="button" value="查询所有学生信息"></td>
               </table>
                  </form>
               
              
               
            
              
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr align="center"  class="t1">
                   <td bgcolor="#D5E4F4"><strong>选择</strong></td>
                    <td bgcolor="#D5E4F4"><strong>学号</strong></td>
                    <td bgcolor="#D5E4F4"><strong>姓名</strong></td>
                        <td bgcolor="#D5E4F4"><strong>性别</strong></td>
                     <td bgcolor="#D5E4F4"><strong>班级</strong></td>
                        <td bgcolor="#D5E4F4"><strong>日期</strong></td>
                    <td bgcolor="#D5E4F4"><strong>操作</strong></td>
                  </tr>
                    <c:forEach items="${list}" var="list">
                    <<tr align="center">
                 
				    <td height="25" align="center">
				    <input type="checkbox" name="ids" value="${c.id}"/></td>			
                      <td>${list.stuid}</td>
                      <td>${list.stuname}</td>
                      <td>${list.stugender=="1"?"男":"女"}</td>
                      <td>${list.stuclass=="1"?"13软件1班":"13软件2班"} </td>
                      <td>${list.studate}</td>
                      <td align="center"><a href="<%=basePath %>test/Student_findStudentbyId.action?stuid=${list.stuid}">修改</a> 
                      <a href="<%=basePath %>test/Student_delStudent.action?stuid=${list.stuid}" onClick="return confirm('确定要删除该课程吗？')">删除</a></td>
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
