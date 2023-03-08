package com.ssafy.ws.step2.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.ws.step2.dto.Movie;

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

		// 전달 받은 파라미터를 이용해서 Movie 객체를 생성
		// 주의할 점은 생성자의 id까지 포함해야 하니, id는 임의로 넣어 주었다.
		Movie movie = new Movie(0, title, director, genre, runningTime);

		// 화면에 출력할 데이터를 위해서 String 말고 StringBuilder를 쓸 예정
		StringBuilder output = new StringBuilder();

		// html 태그가 적용될 수 있도록, 우선 response에 인코딩 입히기!
		response.setContentType("text/html; charset=UTF-8");

		// html 형태의 문을 열어 준다.
		output.append("<html><body>").append("<h1>영화 정보</h1>").append(movie.toString()).append("</body></html>");
		
		// response 객체를 통해서 생성된 html 코드를 출력시켜준다.
		response.getWriter().write(output.toString());
	}
}
