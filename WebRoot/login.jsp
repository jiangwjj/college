<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
   

  </head>
  
  <body>
  <script language="JavaScript">

function mycheck(){
   
   if(isNull(form1.name.value)){  
   alert("请输入用户名！"); 
   return false;
   }
   if(isNull(form1.password.value)){
   alert("请输入密码！");
   return false;
   }
   if(isNull(form1.verify.value)){
   alert("请输入验证码！");
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
  <br><br><br><br><br>
  <table width="684" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="292" align="center" valign="top" background="Images/LoginBg.jpg">
      <table width="600" height="201" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td height="72" align="center"><h3>课堂考勤管理系统</h3></td>
        </tr>
        <tr>
          <td align="center" valign="top">
             <form name="form1" action="<%=basePath %>test/Login_logincheck.action" method="post" onSubmit="return mycheck()">
              <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="30" colspan="2" align="center" class="STYLE2"><span style="color:red;">
                       ${Msg}
                  </span></td>
                  </tr>
                <tr>
                  <td height="30" align="right" class="STYLE2">身份：</td>
                  <td align="left">
                  <select name="type">
                    <option value="">请选择</option>
                   
                    <option value="管理员">管理员</option>
                   
                    <option value="教师">教师</option>
                   
                  </select></td>
                  </tr>
                <tr>
                  <td width="37%" height="30" align="right" class="STYLE2">用户名：</td>
                  <td width="300" align="left"><input type="text" name="name"  class="text1" value="qh" /></td>
                  </tr>
                <tr>
                  <td height="30" align="right" class="STYLE2">密码：</td>
                  <td align="left"><input type="password" name="password"  class="text1" value="111" /></td>
                  </tr>
                  <tr>
                  <td height="30" align="right">验证码：</td>
    <td  width="600" align="left"><input name="verify" id="verify" type="text" /><img name="verifyImg" id="verifyImg" src="<%=basePath %>test/SecurityCodeImage.action" /></td>
    </tr>
                <tr>
                  <td height="30" colspan="2" align="center"><label>
                    <input type="submit" name="button" id="button" value="登录">&nbsp;&nbsp;<input type="reset" name="button" id="button" value="重置">
                  </label></td>
                  </tr>
              </table>
              </form>
          
          </td>
        </tr>
      </table></td>
    </tr>
  </table>


</center>
  </body>
  </body>
</html>
