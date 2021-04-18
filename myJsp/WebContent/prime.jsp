<%@page import="java.util.*,java.text.*" contentType="text/html;charset=utf-8" %>
<%!
boolean isPrime(int num){
	boolean flag = true;
	for(int j = 2 ; j < num ; j++){
		if(num % j == 0){
			flag = false;
			break;
		}
	}
	return flag;
}
%>

<%
List <Integer> primes = new ArrayList();
for(int i = 2 ; i<=1000 ; i++){
	boolean flag = isPrime(i);
	
	if(flag == true){
		//out.println("<h1> " + i +  "</h1>");
		primes.add(i);
	}
}
%>

<%
for(int p : primes){
	
%>
<h1 style="color:red;"><%= p %>是质数</h1>
<%
}
%>