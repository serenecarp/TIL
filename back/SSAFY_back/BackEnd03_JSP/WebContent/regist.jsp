<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>ì¬ë ë±ë¡</h3>
	<form action="main" method="POST">
		<input type="hidden" name="action" value="regist">
		<label>ì´ë¦ : </label>
		<input type="text" placeholder="ì´ë¦ì ìë ¥íì¸ì" name="name"><br>
		<label>ëì´ : </label>
		<input type="number" min="0" placeholder="ëì´ë¥¼ ìë ¥íì¸ì" name="age"><br>
		<input type="radio" id="man" name="gender" value="man">
		<label for="man">ë¨ì</label>
		<input type="radio" id="woman" name="gender" value="woman">
		<label for="woman">ì¬ì</label>
		
		<fieldset>
			<legend>ì·¨ë¯¸</legend>
			<input type="checkbox" id="sleep" name="hobby" value="sleep">
			<label for="sleep">ìë©´</label>
			<input type="checkbox" id="eat" name="hobby" value="eat">
			<label for="eat">ë¨¹ê¸°</label>
			<input type="checkbox" id="study" name="hobby" value="study">
			<label for="study">ê³µë¶</label>
			<input type="checkbox" id="jump" name="hobby" value="jump">
			<label for="jump">ì í</label>
		</fieldset>
		<input type="submit">
	</form>
</body>
</html>