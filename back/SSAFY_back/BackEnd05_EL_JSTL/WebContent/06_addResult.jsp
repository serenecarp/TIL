<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<%
		int num1 = (Integer) request.getAttribute("num1");
		int num2 = (Integer) request.getAttribute("num2");
	%>
	<%=num1%>+<%=num2%>=<%=num1 + num2%>
	<!-- EL -->
	${num1 }+${num2 }=${num1+num2 }
</body>
</html>