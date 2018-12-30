<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>

	<div>
		<h2>List Of All Students</h2>
	</div>
	
	<div>
		<table>
			<tr>
				<th>Name</th>
				<th>Semester</th>
				<th>Email</th>
			</tr>
			<c:forEach var="tempVar" items="${students}">
			<c:set var="var1" value="${tempVar.classesNoJ}"/>
			<c:set var="var2" value="${tempVar.recBooksNoJ}"/>
			<c:if test="${var1 != var2}">
				<tr>
					<td>${tempVar.studentNameJ}</td>
					<td>${tempVar.semesterJ}</td>
					<td>${tempVar.emailJ}</td>
					<td><a href="mail.google.com">Send Email</a></td>
				</tr>
			</c:if>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>