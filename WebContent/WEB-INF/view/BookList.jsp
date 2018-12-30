<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>List of Books</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<!--  add our html table here -->
			<table>
				<tr>
					<th>Title</th>
					<th>Edition</th>
					<th>Author</th>
					<th>publisherJ</th>
					<th>Links</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempVar" items="${books}">

					<tr>
						<td>${tempVar.titleJ}</td>
						<td>${tempVar.editionj}th Edition</td>
						<td>${tempVar.authorJ}</td>
						<td>${tempVar.publisherJ.idJ}</td>
						<td><a href="<c:url value="courseBookUpdate"><c:param name="bookid" value="${tempVar.id}"/>
									<c:param name="position" value="${position}"/>
									<c:param name="courseid" value="${courseid}"/></c:url>">Make Book Choice</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>