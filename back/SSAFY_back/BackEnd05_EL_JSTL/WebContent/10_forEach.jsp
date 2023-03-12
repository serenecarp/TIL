<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화선택</title>
</head>
<body>
	<%
		String[] movieList = { "잉어", "붕어", "참치", "꽁치", "갈치", "상어" };
		pageContext.setAttribute("movieList", movieList);
	%>

	<table border="1">
		<tr>
			<th>index</th>
			<th>count</th>
			<th>title</th>
		</tr>
		<c:forEach items="${movieList }" var="movie" varStatus="status"
			begin="0" end="3" step="3">
			<tr>
				<td>${status.index }</td>
				<td>${status.count }</td>
				<td>${movie }</td>
			</tr>
		</c:forEach>
	</table>

	<c:forEach items="${movieList }" var="movie">
		${movie }<br>
	</c:forEach>
</body>
</html>