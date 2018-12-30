<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses List</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>1st Book Option</th>
			<th>2nd Book Option</th>
		</tr>
		<c:forEach var="tempVar" items="${courses}">
			<tr>
				<td>${tempVar.titleJ}</td>
				<td><a href="<c:url value="availableBooks"><c:param name="courseid" value="${tempVar.idJ}"/><c:param name="position" value="1"/></c:url>">${tempVar.book1J.titleJ}</a></td> <!-- click on title  to pick another book -->
				<td><a href="<c:url value="availableBooks"><c:param name="courseid" value="${tempVar.idJ}"/><c:param name="position" value="2"/></c:url>">${tempVar.book2J.titleJ}</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>