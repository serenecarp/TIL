<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Gothic+A1:wght@400;700;900&display=swap"
	rel="stylesheet">

<!-- CSS -->
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-size: 1em;
	list-style: none;
	font-family: 'Gothic A1', sans-serif;
	font-weight: 400;
}

body {
	background-color: #0c0b00;
	color: #fcf7f7;
}

nav {
	background-color: #121212;
	margin-top: 2em;
	padding-top: 0.5em;
	padding-bottom: 0.5em;
}

.bold {
	font-weight: 700;
}

.superbold {
	font-weight: 900;
}

.logo {
	display: flex;
	background-color: #deb522;
	width: 4em;
	height: 1.8em;
	border-radius: 0.3em;
	justify-content: center;
	align-items: center;
	margin: 0.2em;
	margin-left: 1em;
}

.logo>h1 {
	margin: 1em;
	color: #0c0b00;
}

form {
	width: 40em;
}

fieldset {
	margin: 2em;
	width: 15em;
	display: flex;
	flex-direction: column;
	align-items: center;
}

fieldset>legend {
	margin-left: 20%;
}

legend>strong {
	margin: 1em;
}

.go-regist {
	margin: 1em;
}

.regist>input {
	border: 1px solid #fcf7f7;
	background-color: #0c0b00;
	color: #fcf7f7;
	padding: 0.3em;
	margin: 0.15em;
}

.regist>input:hover {
	border: 1px solid #deb522;
	background-color: #0c0b00;
	color: #deb522;
	padding: 0.3em;
	cursor: pointer;
	margin: 0.15em;
}

form {
	width: 40em;
}

fieldset {
	display: flex;
	flex-direction: column;
	align-items: center;
	width: 15em;
}

fieldset>div {
	display: flex;
	flex-direction: column;
	align-items: center;
	margin: 0.2em;
}

.text {
	align-self: flex-start;
}

div.regist {
	display: flex;
	flex-direction: row;
}
</style>

<!-- /CSS -->