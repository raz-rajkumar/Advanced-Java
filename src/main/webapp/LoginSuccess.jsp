<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="test.UserBean"
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<div id="main">
	<%
	UserBean ub = (UserBean) application.getAttribute("ubean");
	out.println("Welcome User: "+ub.getfName()+"<br>");
	%>
	<div id="btn">
		<a href="profile" class="button">View Profile</a><br>
		<a href="logout" class="button">LogOut</a>
	</div>
	</div>
</body>
</html>