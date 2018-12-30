<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Publisher</title>
</head>
<body>
	<form action="updatePublisher">
	<c:forEach var="tempVar" items="${publishers}">
		<input type="hidden" name="id" value="${tempVar.idJ}"/>
		<label>Name</label><input type="text" name="name" value="${tempVar.nameJ}"/><br>
		<label>Location</label><input type="text" name="location" value="${tempVar.locationJ}"/><br>
		<label>Instructions</label><input type="text" name="instructions" value="${tempVar.instructionsJ}"/><br>
		<input type="submit"/>
	</c:forEach>
	</form>
</body>
</html>