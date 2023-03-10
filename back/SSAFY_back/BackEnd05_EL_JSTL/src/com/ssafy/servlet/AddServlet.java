package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = 10;
		int num2 = 20;
		int add = num1+num2;
		
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		req.setAttribute("add", add);
		req.getRequestDispatcher("06_addResult.jsp").forward(req, resp);
	}
}
