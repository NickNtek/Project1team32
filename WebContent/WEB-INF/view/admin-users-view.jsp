<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2>Professors</h2>
		<table>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			</tr>
			<c:forEach var="tempVar" items="${profs}">
				<tr>
					<td>${tempVar.idJ}</td>
					<td>${tempVar.firstNameJ}</td>
					<td>${tempVar.lastNameJ}</td>
					<td>${tempVar.emailJ}</td>
					<td><a href="<c:url value="deleteProfessor"><c:param name="id" value="${tempVar.idJ}"/></c:url>">Delete</a></td>
					<td><a href="<c:url value="updateProfessorForm"><c:param name="id" value="${tempVar.idJ}"/></c:url>">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	
	<div>
		<h2>Courses</h2>
		<table>
			<tr>
				<th>ID</th>
				<th>Title</th>
			</tr>
			<c:forEach var="tempVar" items="${course}">
				<tr>
					<td>${tempVar.idJ}</td>
					<td>${tempVar.titleJ}</td>
					<td><a href="<c:url value="deleteCourse"><c:param name="id" value="${tempVar.idJ}"/></c:url>">Delete</a></td>
					<td><a href="<c:url value="updateCoursesForm"><c:param name="id" value="${tempVar.idJ}"/></c:url>">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<div>
		<h2>Publishers</h2>
		<table>
			<tr>
				<th>ID</th>
				<th>Title</th>
			</tr>
			<c:forEach var="tempVar" items="${publs}">
				<tr>
					<td>${tempVar.idJ}</td>
					<td>${tempVar.nameJ}</td>
					<td>${tempVar.locationJ}</td>
					<td><a href="<c:url value="deletePublisher"><c:param name="id" value="${tempVar.idJ}"/></c:url>">Delete</a></td>
					<td><a href="<c:url value="updatePublisherForm"><c:param name="id" value="${tempVar.idJ}"/></c:url>">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<div>
		<h2>Students</h2>
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Semester</th>
			</tr>
			<c:forEach var="tempVar" items="${studs}">
				<tr>
					<td>${tempVar.idJ}</td>
					<td>${tempVar.studentNameJ}</td>
					<td>${tempVar.emailJ}</td>
					<td>${tempVar.semesterJ}</td>
					<td><a href="<c:url value="deleteStudent"><c:param name="id" value="${tempVar.idJ}"/></c:url>">Delete</a></td>
					<td><a href="<c:url value="updateStudentForm"><c:param name="id" value="${tempVar.idJ}"/>></c:url>">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>