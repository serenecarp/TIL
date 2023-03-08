<!--
교수님.. 부트스트랩 써보다가 시간이 너무 많이 지나서..
오늘만-어쩌면 이번 주말까지-기존 못난 ui 사용하겠습니다..
대신 백엔드 수업 내용에 좀 더 집중할게요.
여유가 되면 꼭 부트스트랩 써서 다시 만들겠습니다!!
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>MOFY - 영화 등록</title>
<%@ include file="/style.jsp"%>



</head>

<body>
	<!-- 화면 상단 nav바 -->
	<%@ include file="/header.jsp"%>


	<!-- 영화 정보를 입력하고 등록 -->
	<form action="main" method="POST">
		<input type="hidden" name="action" value="regist">
		<fieldset>
			<legend>
				<strong class="bold">영화 정보 입력</strong>
			</legend>
			<div class="title">
				<label class="text">제목</label> <input type="text" name="title"
					class="input">
			</div>

			<div class="director">
				<label class="text">감독</label> <input type="text" name="director"
					class="input">
			</div>

			<div class="genre">
				<label class="text">장르</label> <input type="text" name="genre"
					class="input">
			</div>

			<div class="runnint-time">
				<label class="text">상영 시간</label> <input type="text"
					name="runningTime" class="input">
			</div>

			<!-- 등록, 초기화 버튼 -->
			<div class="regist">
				<input type="submit" value="등록"> <input type="reset"
					value="초기화">
			</div>

		</fieldset>

	</form>
</body>

</html>