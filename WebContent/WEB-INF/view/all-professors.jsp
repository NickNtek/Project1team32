<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Professor List</title>
</head>
<body>
	<div>
	<h2>List Of All Professors</h2>
	</div>
	
	<div>
		<table>
			<tr>
				<th>Email</th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
			<c:forEach var="tempVar" items="${profs}">
				<tr>
					<td>${tempVar.firstNameJ}</td>
					<td>${tempVar.lastNameJ}</td>
					<td>${tempVar.emailJ}</td>
					<td><a href="<c:url value="courseList"><c:param name="profId" value="${tempVar.idJ}"/></c:url>">Show Classes</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>