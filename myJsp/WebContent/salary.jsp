<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>year</td>
		<td>salary</td>
	</tr>
	
	<%
		for(int i = 0; i<=50; i++){
			out.println("<tr>");
			out.println("<td>"+ i +"</td>");
			int sal = 0;
			if(i <=5){
				sal = 1500 + i * 150;
			}else if(i > 5 && i<=10){
				sal = 1500 + 150 * 5 + 300 * (i-5);
			}else if(i > 10){
				sal = 1500 + 150 * 5 + 300 * 5 +  375 * (i-10);
			}
			out.println("<td>" + sal +   "</td>");
			out.println("</tr>");
		}
	%>
</table>
</body>
</html>