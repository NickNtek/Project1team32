<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcoming Page</title>
</head>
<body>
	<h3>Please Choose Your Role</h3>
	<a href="<c:url value="/professors/profList"></c:url>">Professor</a>
	<a href="<c:url value="/publisher/list"></c:url>">Publisher</a>
	<a href="<c:url value="/secretary/studentList"></c:url>">Secretary</a>
	<a href="<c:url value="/admin/"></c:url>">System Administrator</a>
</body>
</html>