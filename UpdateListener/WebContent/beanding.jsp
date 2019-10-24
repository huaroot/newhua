<%@page import="org.student.listener.BeanListener"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	监听 session对象：
	<% 
		BeanListener bean = new BeanListener();
		session.setAttribute("bean", bean);
	%>
</body>
</html>