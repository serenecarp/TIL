<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반찬</title>
</head>
<body>
	<h2>반찬을 골라보자</h2>
	<form action="12_checkBoxResult.jsp">
	<input type="checkbox" name="dish" value="맥주">맥주
	<input type="checkbox" name="dish" value="교수">교수
	<input type="checkbox" name="dish" value="버섯">버섯<br>
	<input type="checkbox" name="dish" value="참치">참치
	<input type="checkbox" name="dish" value="꽁치">꽁치
	<input type="checkbox" name="dish" value="밈밈">밈밈<br>
	<button>구매</button>
	</form>
</body>
</html>