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
${result} lines Changed<br>
<a href="<c:url value="/books/PublisherBooks?pId=${publ}"></c:url>">Publisher Screen</a>

</body>
</html>