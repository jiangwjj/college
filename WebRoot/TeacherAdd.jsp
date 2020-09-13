<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>课堂考勤管理系统</title>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="Style/Style.css" rel="stylesheet" type="text/css" />
</head>
<script language="JavaScript">


function mycheck(){
if(isNull(form1.teaid.value)){  
   alert("请输入id！"); 
   return false;
   }
   if(isNull(form1.teaname.value)){  
   alert("请输入用户名！"); 
   return false;
   }
   if(isNull(form1.email.value)){
   alert("请输入电子邮箱！");
   return false;
   }
   if(isNull(form1.phone.value)){
   alert("请输入电话号码！");
   return false;
   }
}

function isNull(str){
if ( str == "" ) return true;
var regu = "^[ ]+$";
var re = new RegExp(regu);
return re.test(str);
}
   
   
</script>
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
          <td width="709" align="center" valign="top" bgcolor="#F6F9FE"><table width="800" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="30" background="Images/mainMenuBg.jpg" style="padding-left:25px;">添加教师</td>
            </tr>
            <tr>
              <td height="470" align="center" valign="top" bgcolor="#F6F9FE"><form name="form1" method="post" action="<%=basePath %>test/Teacher_addTeacher.action" onSubmit="return mycheck()" >
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="33%" height="30" align="right">&nbsp;</td>
                    <td width="67%">&nbsp;</td>
                  </tr>
                   <td height="30" colspan="2" align="center" class="STYLE2"><span style="color:red;">
                       ${Msg}
                  </span></td>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>ID：</td>
                    <td><input name="teaid" type="text" class="text2" ></td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>姓名：</td>
                    <td><input name="teaname" type="text" class="text2" ></td>
                  </tr>
                    <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>电子邮件：</td>
                    <td><input name="email" type="text" class="text2" ></td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>电话号码：</td>
                    <td><input name="phone" type="text" class="text2" ></td>
                  </tr>
                  <tr>
                    <td height="30" align="right" ><span style="color:red;">
                  男 <input type="radio" checked="checked" name="teagender" value="1" />
                                                                        女 <input type="radio" name="teagender" value="0" />
                    </td>
                  </tr>
                   <tr>
                    <td height="30" align="right"><span style="color:red;"></span></td>
                    <td><input name="teapassword" type="hidden" class="text2" ></td>
                  </tr>
                  
                  
                
                  <tr>
                    <td height="30">&nbsp;</td>
                    <td><input type="submit" name="button" id="button" value="添加">
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
