<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	从硬盘中读取session域中的对象：<br/>
	mun:${sessionScope.bean.mun }<br/>
	user:${sessionScope.bean.user }<br/>
	<%
		out.println(session.getClass()) ;
	%>
</body>
</html>