<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>

	<h1>Welcome to the Spring MVC</h1>
	
	<%
		String name = (String)request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
	
	%>
	
	<h1>Name is <%=name %></h1>
	<h1>ROll is <%=id %></h1>

</body>
</html>