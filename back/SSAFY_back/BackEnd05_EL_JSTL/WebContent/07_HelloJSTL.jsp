<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<c:out value="Hello SSAFY!"></c:out> <br>
	<c:out value="Hello SSAFY!" /> <br>
	<!-- c:set 써보기
	
	scope	: 어떤 영역에다가 내가 해당 값을 집어 넣을지. 생략하면 page
	var		: 변수 이름
	value	: 값
	
	-->
	<c:set var="msg" value="Hello1"/>
	${msg }<br>
	<c:set var="msg2">hello2</c:set>
	${msg2 }<br>
</body>
</html>