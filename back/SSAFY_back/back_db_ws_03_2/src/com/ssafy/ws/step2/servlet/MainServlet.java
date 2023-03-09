package com.ssafy.ws.step2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 이 서블릿이 호출되기 위해서는 url 상에 http://server_ip:port/context_name/main 이 필요하다.

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	// 현재까지 등록된 영화 개수
	private static int movieCount = 0;
	private static final long serialVersionUID = 1L;

	// front-controller pattern
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doProcess(req, resp);
	}

	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		switch (action) {
		case "regist":
			doRigist(req, resp);
			break;
		default:
			break;
		}
	}

	// 영화 등록 메소드
	private void doRigist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 각 name에 해당하는 데이터들을 가져와서
		// 추후 regist_result로 보낼 request에 저장
		String title = req.getParameter("title");
		String director = req.getParameter("director");
		String genre = req.getParameter("genre");
		int runningTime = Integer.parseInt(req.getParameter("runningTime"));

		// 세션 - 영화개수 저장
		// *세션을 forward한 후에 선언하고 setAttribute했더니
		// *movieCount가 비정상적으로 작동했다.
		// *그래서 앞으로 당겼다.
		HttpSession session = req.getSession();
		session.setAttribute("movieCount", ++movieCount);
		
		req.setAttribute("title", title);
		req.setAttribute("director", director);
		req.setAttribute("genre", genre);
		req.setAttribute("runningTime", runningTime);
		
		// request 정보를 regist_result에 보내기
		// forward방식
		RequestDispatcher disp = req.getRequestDispatcher("/regist_result.jsp");
		disp.forward(req, resp);
		
	}
	

}
