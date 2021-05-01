<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 姓名: ${requestScope.student.name }</h1>
<h1> 电话: ${requestScope.student.mobile }</h1>
<h1> 评级: ${requestScope.grade }</h1>
</body>
</html>