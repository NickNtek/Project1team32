<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="updateProfessor">
	<c:forEach var="tempVar" items="${profs}">
		<input type="hidden" name="id" value="${tempVar.idJ}"/>
		<label>First Name</label><input type="text" name="fname" value="${tempVar.firstNameJ}"/><br>
		<label>Last Name</label><input type="text" name="lname" value="${tempVar.lastNameJ}"/><br>
		<label>Email</label><input type="text" name="email" value="${tempVar.emailJ}"/><br>
		<input type="submit"/>
	</c:forEach>
	</form>
</body>
</html>