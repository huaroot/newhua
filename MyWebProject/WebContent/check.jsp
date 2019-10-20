<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.Dao.loginDao" %>  
<%@ page import="org.landxaio.dao.Login" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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