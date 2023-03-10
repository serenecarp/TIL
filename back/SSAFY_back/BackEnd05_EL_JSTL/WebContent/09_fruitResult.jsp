<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선택결과</title>
</head>
<body>
	<c:if test="${param.fruit==1 }">
		<div style="color: orange">귤</div>
	</c:if>

	<hr>
	<c:choose>
		<c:when test="${param.fruit==1 }">
			<div style="color: orange">귤</div>
		</c:when>
		<c:otherwise>
			<div>ㅇㅇ</div>
		</c:otherwise>
	</c:choose>
</body>
</html>