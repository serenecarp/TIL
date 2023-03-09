<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("password");

	if (id.equals("serenecarp") && pw.equals("q1w2e3r4")) {
		session.setAttribute("loginUser", id);
		response.sendRedirect("main.jsp");
	} else {
		response.sendRedirect("loginForm.jsp");
	}
%>