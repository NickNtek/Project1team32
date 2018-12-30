<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addPublisher">
	<input type="hidden" name="tableName" value="Publisher"/>
	<label>Name</label><input type="text" name="name" /><br>
	<label>Location</label><input type="text" name="loc"/><br>
	<label>Instructions</label><input type="text" name="instr"/><br>
	<input type="submit">
</form>
</body>
</html>