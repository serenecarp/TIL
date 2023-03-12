<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외처리</title>
</head>
<body>
	<c:catch var="errmsg">
		예외 발생 전<br>
		<%=1 / 0%>
		예외 발생 후<br>
	</c:catch>
	
	${errmsg }
</body>
</html>