<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
	<div id="main">
		<%
		String fname = (String) request.getAttribute("fname");
		UserBean ub = (UserBean) application.getAttribute("ubean");
		out.println("Page Belongs to : " + fname + "<br>");
		%>
		<form action="upd" method="POST">
			<table>
				<tr>
					<td>City</td>
					<td>: <input type="text" value="<%=ub.getCity()%>" name="city"></td>
				</tr>
				<tr>
					<td>Mail Id</td>
					<td>: <input type="text" value="<%=ub.getMailId()%>" name="mailid"></td>
				</tr>
				<tr>
					<td>Phone No</td>
					<td>: <input type="text" value="<%=ub.getPhNo()%>" name="phno"></td>
				</tr>
			</table>
			<input type="submit" value="Update" class="button">
			<a href="logout"
			class="button">Logout</a>

		</form>
	</div>
</body>
</html>