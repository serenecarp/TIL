<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
	<h2>오늘의 반찬</h2>
	<c:forEach var="item" items="${paramValues.dish }" varStatus="status">
	${item }<c:if test="${not status.last }">,</c:if>
	</c:forEach>

</body>
</html>