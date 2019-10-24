<%@page import="org.student.listener.BeanListeners"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	写入硬盘，钝化操作：
	<%
		BeanListeners bean = new BeanListeners();
		bean.setMun(10);
		bean.setUser("林蒂固");
		session.setAttribute("bean", bean);
	%>
</body>
</html>