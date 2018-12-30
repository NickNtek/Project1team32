<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<!-- loop over and print publishers -->
		<c:forEach var="tempVar" items="${myPublishers}">
				<a href="<c:url value="PublisherBooks"> <c:param name="pId" value="${tempVar.idJ}"/>
				</c:url>" >${tempVar.nameJ} </a><br>
		</c:forEach>
</body>
</html>