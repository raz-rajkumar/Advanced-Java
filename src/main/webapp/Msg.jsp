<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failed</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<div id="main" >
	<%
	String msg = (String) request.getAttribute("msg");
	out.println(msg + "<br>");
	%>
<div>
	<%@include file="index.html" %>
</div>
</div>
</body>
</html>