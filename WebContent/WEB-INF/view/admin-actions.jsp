<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Add User</h3>
	<form action="addUserForm">
		<select name="user">
			<option value="1">professor</option>
			<option value="2">Publisher</option>
			<option value="3">Course</option>
			<option value="4">Student</option>
		</select>
		<input type="submit"/>
	</form>
	<br>
	
	<a href="<c:url value="adminUsersView"></c:url>">Delete or Update User</a><br>
</body>
</html>