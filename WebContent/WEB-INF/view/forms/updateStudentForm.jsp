<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateStudent">
	<c:forEach var="tempVar" items="${student}">
		<input type="hidden" name="id" value="${tempVar.idJ}"/>
		<label>Student Name</label><input type="text" name="student" value="${tempVar.studentNameJ}"/><br>
		<label>Email</label><input type="text" name="email" value="${tempVar.emailJ}"/><br>
		<label>semester</label><input type="text" name="semester" value="${tempVar.semesterJ}"/><br>
		<label>Number of classes</label><input type="number" name="NoClasses" value="${tempVar.classesNoJ}"/><br>
		<label>Received Books</label><input type="number" name="NoReceived" value="${tempVar.recBooksNoJ}"/><br>
		<input type="submit"/>
	</c:forEach>
	</form>
</body>
</html>