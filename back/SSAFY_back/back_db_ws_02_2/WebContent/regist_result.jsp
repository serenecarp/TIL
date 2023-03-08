<!--
교수님.. 부트스트랩 써보다가 시간이 너무 많이 지나서..
오늘만-어쩌면 이번 주말까지-기존 못난 ui 사용하겠습니다..
대신 백엔드 수업 내용에 좀 더 집중할게요.
여유가 되면 꼭 부트스트랩 써서 다시 만들겠습니다!!
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.ssafy.ws.step2.dto.Movie"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>MOFY - 영화 등록 결과</title>

</head>

<body>
	<%@ include file="/header.jsp"%>
	<%
		Movie movie = (Movie) request.getAttribute("movie");
	%>
	<h2>등록 결과</h2>
	<span>ID</span><br>
	<%= request.getAttribute("id") %><br>
	<span>제목</span><br>
	<%= request.getAttribute("title") %><br>
	<span>감독</span><br>
	<%= request.getAttribute("director") %><br>
	<span>장르</span><br>
	<%= request.getAttribute("genre") %><br>
	<span>상영시간</span><br>
	<%= request.getAttribute("runningTime") %><br>
	
	<a href="regist.jsp">추가등록</a>
</body>

</html>