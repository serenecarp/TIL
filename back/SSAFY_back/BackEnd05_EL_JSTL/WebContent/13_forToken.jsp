<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>토큰</title>
</head>
<body>
	<c:forTokens var="city" items="서울,대전,구미.광주.부울경" delims=",">
		${city }<br>
	</c:forTokens>
	<hr>
	<c:forTokens var="city" items="서울,대전,구미.광주.부울경" delims=".,">
		${city }<br>
	</c:forTokens>
</body>
</html>