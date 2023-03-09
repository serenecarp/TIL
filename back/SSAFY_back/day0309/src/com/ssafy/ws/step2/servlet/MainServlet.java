package com.ssafy.ws.step2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 요청 시 한글 파라미터의 처리를 위해 encoding을 처리해준 후에 pattern을 부른다!
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "regist":
			// 보여줘, 어떤 작업 해 줘..
			doRegist(request, response);
			break;

		default:
			break;
		}
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String director = request.getParameter("director");
		String genre = request.getParameter("genre");
		int runningTime = Integer.parseInt(request.getParameter("runningTime"));

		// 5-a. 전달 받은 파라미터를 request에 담는다.
		request.setAttribute("title", title);
		request.setAttribute("director", director);
		request.setAttribute("genre", genre);
		request.setAttribute("runningTime", runningTime);

		// 5-b. JSP 화면 호출을 위해서 RequestDispatcher의 forward를 사용한다.
		// 5-c. jsp의 이름을 넘겨주는데, forward에서 `/`는 context root를 뜻한다. 잊지 말자
		RequestDispatcher disp = request.getRequestDispatcher("/regist_result.jsp");
		disp.forward(request, response);
	}
}
