<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!int cnt1 = 0;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int cnt2 = 0;
out.print("cnt1 : ");
out.print(++cnt1);
out.print("<br>");
out.print("cnt2 : ");
out.print(++cnt2);
out.print("<br>");
%>
</body>
</html>
