<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateCourse">
	<c:forEach var="tempVar" items="${courses}">
		<input type="hidden" name="id" value="${tempVar.idJ}"/>
		<label>Title</label><input type="text" name="title" value="${tempVar.titleJ}"/><br>
	</c:forEach>
		<label>Professor</label>
			<select name="Professor">
			<c:forEach var="tempVar" items="${profs}">
				<option  value="${tempVar.idJ}">${tempVar.firstNameJ}  ${tempVar.lastNameJ}</option>
			</c:forEach>
			</select><br>
		
		<input type="submit"/>
	
	</form>
</body>
</html>