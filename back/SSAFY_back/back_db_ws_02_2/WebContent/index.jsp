<!--
교수님.. 부트스트랩 써보다가 시간이 너무 많이 지나서..
오늘만-어쩌면 이번 주말까지-기존 못난 ui 사용하겠습니다..
대신 백엔드 수업 내용에 좀 더 집중할게요.
여유가 되면 꼭 부트스트랩 써서 다시 만들겠습니다!!
-->


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>영화정보사이트</title>
<%@ include file="/style.jsp"%>

<style>

fieldset>legend {
	margin-left: 15%;
}

legend>strong {
	margin: 1em;
}

.go-regist {
	margin: 1em;
}

.go-regist>input {
	border: 1px solid #fcf7f7;
	background-color: #0c0b00;
	color: #fcf7f7;
	padding: 0.3em;
}

.go-regist>input:hover {
	border: 1px solid #deb522;
	background-color: #0c0b00;
	color: #deb522;
	padding: 0.3em;
	cursor: pointer;
}

.go-regist>input:hover {
	border: 1px solid #deb522;
	background-color: #0c0b00;
	color: #deb522;
	padding: 0.3em;
	cursor: pointer;
}
</style>

<!-- /CSS -->




</head>

<body>
	<%@ include file="/header.jsp" %>

	<!-- 영화 정보 입력하러 가기 => action을 해당 페이지로 -->
	<form action="regist.jsp" method="GET">
		<input type="hidden" name="action" value="registPage">
		<fieldset>
			<legend>
				<strong class="go-regist bold">영화 정보 입력하기</strong>
			</legend>

			<div class="go-regist">
				<input type="submit" name="action" value="Go">
			</div>

		</fieldset>

	</form>
	
</body>

</html>