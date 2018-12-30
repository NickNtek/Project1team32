<%@ page language="java" contentType="text/html; charset=UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Publisher Books</title>

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
	<table>
		<tr>
			<th>Title</th>
			<th>Edition</th>
			<th>Author</th>
			<th>Publisher</th>
			<th>Functions</th>
		</tr>
		<!-- loop over and print The Books -->
		<c:forEach var="tempVar" items="${books}">

			<tr>
				<td>${tempVar.titleJ}</td>
				<td>${tempVar.editionj}thEdition</td>
				<td>${tempVar.authorJ}</td>
				<td>${tempVar.publisherJ.idJ}</td>
				<td><a href="<c:url value="AvailabilityForm"><c:param name="bookID" value="${tempVar.id}" />
							<c:param name="publID" value="${tempVar.publisherJ.idJ}" /></c:url>">${tempVar.availableJ}</a></td>
				<td><a href="<c:url value="bookReceivedForm"><c:param name="bookID"  value="${tempVar.id}"/>
							<c:param name="publID" value="${tempVar.publisherJ.idJ}" />
							<c:param name="avail" value="${tempVar.availableJ}"/></c:url>">Delivery Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>