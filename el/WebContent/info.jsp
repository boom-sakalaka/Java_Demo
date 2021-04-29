<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.imooc.el.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String grade = (String)request.getAttribute("grade");
	Student stu = (Student)request.getAttribute("student");
	out.println("<h1>姓名："+ stu.getName() +"</h1>");
	out.println("<h2>手机："+ stu.getMobile() +"</h2>");
	out.println("教师评级:"+ grade);
%>
</body>
</html>