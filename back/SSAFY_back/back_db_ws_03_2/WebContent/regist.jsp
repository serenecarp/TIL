<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>regist</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">

</head>

<body class="bg-dark">
	<!--navbar include -->
	<%@ include file="/header.jsp"%>

	<!-- 등록할 영화 정보 입력할 container -->
	<div class="container">
		<!-- 등록한 영화 개수: session에서 가져옴 -->
		<p class="text-light m-3">
			지금까지 등록된 영화 수:
			<%=session.getAttribute("movieCount")%>
		</p>
		<!-- 해당 input들을 POST방식으로 main에 보낸다(MainServlet) -->
		<form method="POST" action="main">
			<fieldset>
				<legend class="text-light ms-3 mb-4">영화 정보 입력</legend>
				<!-- front controller pattern parameter -->
				<!-- action이름 달고 있는 애가 어떤 value를 갖고 있는지에 따라 -->
				<!-- 다른 작업을 수행할 것 -->
				<input type="hidden" name="action" value="regist">

				<!-- 영화 제목 입력 -->
				<div class="row">
					<div class="col-md-2">
						<!-- 제목 -->
						<label for="title" class="text-light m-2">제목</label>
					</div>
					<div class="col-md-4">
						<input type="text" id="title" name="title" class="form-control">
					</div>
				</div>

				<!-- 영화 감독 입력 -->
				<div class="row">
					<div class="col-md-2">
						<!-- 감독 -->
						<label for="director" class="text-light m-2">감독</label>
					</div>
					<div class="col-md-4">
						<input type="text" id="director" name="director"
							class="form-control">
					</div>
				</div>

				<!-- 영화 장르 입력 -->
				<div class="row">
					<div class="col-md-2">
						<!-- 장르 -->
						<label for="genre" class="text-light m-2">장르</label>
					</div>
					<div class="col-md-4">
						<input type="text" id="genre" name="genre" class="form-control">
					</div>
				</div>

				<!-- 영화 상영시간 입력 -->
				<div class="row">
					<div class="col-md-2">
						<!-- 상영시간 -->
						<label for="runningTime" class="text-light m-2">상영시간</label>
					</div>
					<div class="col-md-4">
						<input type="number" id="runningTime" name="runningTime"
							class="form-control">
					</div>
				</div>

				<!-- 제출/초기화 버튼 -->
				<div class="row mt-4">
					<div class="col-md-3 text-md-end">
						<input class="btn btn-warning" type="submit" value="등록">
					</div>
					<div class="col-md-2 text-md-start px-0">
						<input class="btn btn-secondary" type="reset" value="초기화">
					</div>
				</div>
			</fieldset>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>
</body>

</html>