package com.ssafy.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web.xml을 이용해 직접 등록함.
// 경로는 /MyServlet
public class MyServlet4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<head>");
		writer.append("<title>Hello</title>");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<h1>MyMyMyMy</h1>");
		writer.append("</body>");
		writer.append("</html>");
	}
}
