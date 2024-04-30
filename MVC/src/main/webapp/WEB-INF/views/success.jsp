<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>

</head>
<body>
	
	<h1>Data coming from Controller to View</h1>
	
	<%
	String email = (String) request.getAttribute("email");
	String password = (String) request.getAttribute("password");
	
	%>
	
	<h1>Your Email is <%=email %></h1>
	<h1>Your Password is <%=password %></h1>

</body>
</html>