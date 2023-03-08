/*
교수님.. 부트스트랩 써보다가 시간이 너무 많이 지나서..
오늘만-어쩌면 이번 주말까지-기존 못난 ui 사용하겠습니다..
대신 백엔드 수업 내용에 좀 더 집중할게요.
여유가 되면 꼭 부트스트랩 써서 다시 만들겠습니다!!
*/

package com.ssafy.ws.step2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.ws.step2.dto.Movie;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF=8");
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// POST 인코딩 설정
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);
	}

	// Front Controller Pattern
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String action = req.getParameter("action");
		switch (action) {
		case "regist":

			doRegist(req, resp);
			break;
		default:
			break;
		}
	}
	
	private void doRegist(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String title = req.getParameter("title");
		String director = req.getParameter("director");
		String genre = req.getParameter("genre");
		int runningTime = Integer.parseInt(req.getParameter("runningTime"));
		
		
		Movie movie = new Movie(123, title, director, genre, runningTime);
		
		req.setAttribute("id", movie.getId());
		req.setAttribute("title", movie.getTitle());
		req.setAttribute("director", movie.getDirector());
		req.setAttribute("genre", movie.getGenre());
		req.setAttribute("runningTime", movie.getRunningTime());
		
		RequestDispatcher disp = req.getRequestDispatcher("/regist_result.jsp");
		disp.forward(req, resp);

	}

}