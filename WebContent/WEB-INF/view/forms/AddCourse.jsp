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
	<form action="addCourse">
		<label>Title</label><input type="text" name="title"/><br>
		<label>Professor</label>
		<select name="professor">
			<c:forEach var="tempVar" items="${profList}">
				<option value="${tempVar.idJ}">${tempVar.firstNameJ} ${tempVar.lastNameJ}</option>
			</c:forEach>
		</select>
	</form>
</body>
</html>