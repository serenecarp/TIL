<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!String name = "SSAFY";

	// 두 정수를 더하는 메소드
	public int add(int A, int B) {
		return A + B;
	}

	// 절댓값을 반환하는 메소드
	public int abs(int A) {
		return A > 0 ? A : -A;
	}

	int a = 10;
	int b = -20;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언</title>
</head>
<body>
	<%
		out.print(add(a, b));
	%> <br>
	<%  %>
</body>
</html>