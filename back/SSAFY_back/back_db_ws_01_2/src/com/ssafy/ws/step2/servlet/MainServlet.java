package com.ssafy.ws.step2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.ws.step2.dto.Movie;

// 이 서블릿이 호출되기 위해서는 url 상에 http://server_ip:port/context_name/main 이 필요하다.

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// doProcess로 보냄
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		doProcess(req, resp);
	}

	// doGet으로 보냄
	// 왜
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);

	}

	// action == regist이면 등록 절차를 수행
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String action = req.getParameter("action");
		switch (action) {
		case "regist":
			// 새로운 영화 인스턴스 생성
			Movie movie = new Movie();
			movie.setTitle(req.getParameter("title"));
			movie.setDirector(req.getParameter("director"));
			movie.setGenre(req.getParameter("genre"));
			movie.setRunningTime(Integer.parseInt(req.getParameter("runningTime")));
			PrintWriter movieInfo = resp.getWriter();
			movieInfo.append("<html>");
			movieInfo.append("<head>");
			movieInfo.append("<title>Movie Info</title>");
			movieInfo.append("</head>");
			movieInfo.append("<body>");
			movieInfo.append("<p>" + movie.toString() + "</p>");
			movieInfo.append("</body>");
			movieInfo.append("</html>");
			break;
			
		default:
			break;
		}

	}

}
