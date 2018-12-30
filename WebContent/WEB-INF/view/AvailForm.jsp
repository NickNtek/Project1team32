<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AvailabilityUpdate">
		<label>Type New Availability </label><label name="BookID">${BookID}</label>
		<input type="hidden" name="BookID" value="${BookID}" >
		<input type="hidden" name="publID" value="${PublID}">
		<input type="text" name="availability"/>
		<input type="submit"/>
	</form>
</body>
</html>