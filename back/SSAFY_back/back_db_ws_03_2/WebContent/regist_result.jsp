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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>

<body class="bg-dark">
	<!--navbar include -->
	<%@ include file="/header.jsp"%>

	<!-- 영화 등록 결과 -->
	<h2 class="text-light m-3 ms-5">영화 등록 결과</h2>
	<div class="container m-4">
		<!-- 등록된 영화 개수: session에서 가져옴 -->
		<p class="text-light m-3">
			지금까지 등록된 영화 수:
			<%=session.getAttribute("movieCount")%>
		</p>
		<!-- 영화 제목 -->
		<div class="row m-1">
			<div class="col col-lg-2 text-light">제목</div>
			<div class="col-6 col-lg-4 text-light ">
				<%=request.getAttribute("title")%>
			</div>
		</div>
		<!-- 영화 감독 -->
		<div class="row m-1">
			<div class="col col-lg-2 text-light">감독</div>
			<div class="col-6 col-lg-4 text-light">
				<%=request.getAttribute("director")%>
			</div>
		</div>
		<!-- 영화 장르 -->
		<div class="row m-1">
			<div class="col col-lg-2 text-light">장르</div>
			<div class="col-6 col-lg-4 text-light">
				<%=request.getAttribute("genre")%>
			</div>
		</div>
		<!-- 영화 상영시간 -->
		<div class="row m-1">
			<div class="col col-lg-2 text-light">상영시간</div>
			<div class="col-6 col-lg-4 text-light">
				<%=request.getAttribute("runningTime")%>
			</div>
		</div>

		<!-- 추가등록버튼: 등록페이지로 돌아감 -->
		<div class="m-3">
			<a class="btn btn-warning" href="regist.jsp">추가등록</a>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>
</body>

</html>