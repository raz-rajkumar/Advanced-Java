<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Profile</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
	<div id="main">
		<%
		String fname = (String) request.getAttribute("fname");
		UserBean ub = (UserBean) application.getAttribute("ubean");
		out.println("Page Belongs to : " + fname + "<br>");
		out.println("First Name: " + ub.getfName() + "<br>");
		out.println("Last Name: " + ub.getlName() + "<br>");
		out.println("City : " + ub.getCity() + "<br>");
		out.println("Mail Id: " + ub.getMailId() + "<br>");
		out.println("Phone No: " + ub.getPhNo() + "<br>");
		%>
		<a href="edit" class="button">Edit</a><br> <a href="logout"
			class="button">Logout</a>
	</div>
</body>
</html>