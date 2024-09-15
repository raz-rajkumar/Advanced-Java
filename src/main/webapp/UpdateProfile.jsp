<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
	<div id="main">
		<%
		String fname = (String) request.getAttribute("fname");
		String msg = (String) request.getAttribute("msg");
		out.println("Page Belongs to : " + fname+"<br>");
		out.println(msg + "<br>");
		%>
		<div id="btn">
			<a href="profile" class="button">View Profile</a><br> 
			<a href="logout" class="button">LogOut</a>
		</div>
	</div>
</body>
</html>