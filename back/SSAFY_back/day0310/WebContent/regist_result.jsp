<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>영화 등록 결과</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>

<body>
	<div class="container mt-3">
		<h1>영화 등록 결과</h1>
		<%-- 이것이 jsp의 주석 --%>
		<h2>지금까지 등록된 영화 수: <%=session.getAttribute("movieCount")%></h2>
		<table>
			<thead>
				<tr>
					<th>항목</th>
					<th>내용</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>제목</td>
					<td><%=request.getAttribute("title")%></td>
				</tr>
				<tr>
					<td>감독</td>
					<td><%=request.getAttribute("director")%></td>
				</tr>
				<tr>
					<td>장르</td>
					<td><%=request.getAttribute("genre")%></td>
				</tr>
				<tr>
					<td>상영시간</td>
					<td><%=request.getAttribute("runningTime")%></td>
				</tr>
			</tbody>
		</table>

		<a class="btn btn-primary" href="regist.jsp">영화 추가 등록하러 가기</a>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>
</body>

</html>