<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>在此处插入标题</title>
</head>
<body>
<<<<<<< HEAD
更新数据：
=======
插入数据：	
>>>>>>> branch 'master' of git@github.com:huaroot/newhua.git
	<%
		//ServletContext appliaction
		application.setAttribute("name", "张三");//增加
		application.setAttribute("name", "李客户");//替换
		application.removeAttribute("name");//删除
		//session
		session.setAttribute("name", "张三");
		session.setAttribute("name", "李客户");
		session.removeAttribute("name");
		//request
		request.setAttribute("name", "张三");
		request.setAttribute("name", "李客户");
		request.removeAttribute("name");
	%>
</body>
</html>
