<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
    <title>课堂考勤系统</title>
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
          <td width="191" height="500" align="center" valign="top" background="Images/leftbg.jpg">
          <%@ include file="Left.jsp"%>
          </td>
          <td width="709" align="center" valign="top" bgcolor="#F6F9FE"><table width="709" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="30" background="Images/mainMenuBg.jpg" style="padding-left:25px;">修改学生</td>
            </tr>
            <tr>
              <td height="470" align="center" valign="top" bgcolor="#F6F9FE"><form name="form1" method="post" action="<%=basePath %>test/Student_calcuateOfStudentTotal.action?stuid=${student.stuid}${all.stuid}" onSubmit="return mycheck()" >
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="33%" height="30" align="right">&nbsp;</td>
                    <td width="67%">&nbsp;</td>
                  </tr>
                  
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>学号：</td>
                    <td>${student.stuid}</td>
                  </tr>
                  <tr>
                     <td height="30" align="right"><span style="color:red;">*</span>姓名：</td>
                   <td>${student.stuname}</td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>班级：</td>
                    <td>${student.stuclass=="1"?"13软件1班":"13软件2班"}</td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>性别：</td>
                    <td>${student.stugender=="1"?"男":"女"}</td>
                  </tr>
                     <tr>
                   <td height="30" align="right"><span style="color:red;">*</span>原因：</td>
                    <td><select name="stu" id="Domitory_BuildingID">
                      <option value="">请选择</option>
                
                      <option value="0">迟到</option>
                        <option value="1">旷课</option>
                          <option value="2">正常</option>
                 
                      </select></td>
                      <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>日期：</td>
                    <td> <input id="studatewww" name="studatewww" class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" /><br><br>  
                    </td>
                  </tr>
                   
                  
                  <tr>
                    <td height="30">&nbsp;</td>
                    <td><input type="submit" name="button" id="button" value="确定">
                      &nbsp;&nbsp;
                      <input type="button" name="button2" id="button2" value="返回上页" onClick="javascript:history.back(-1);"></td>
                  </tr>
                </table>
              </form></td>
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
