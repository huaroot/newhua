<%@ page language="java" contentType="text/html; charset=ISO-8859-5"
    pageEncoding="ISO-8859-5"%>
<%@ page import="com.Dao.loginDao" %>  
<%@ page import="org.landxaio.dao.Login" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-5">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		Login login = new Login(name,pwd);
		
		loginDao dao = new loginDao();
		int result = dao.login(login);
		if(result > 0){
			out.print("登入成功！");
		}else if(result == 0){
			out.print("登入失败！");
		}else{
			out.print("系统异常！！");
		}
		
	%>
	
</body>
</html>