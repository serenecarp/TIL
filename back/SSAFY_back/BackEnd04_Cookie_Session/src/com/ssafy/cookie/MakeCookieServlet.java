package com.ssafy.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/make")
public class MakeCookieServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		String value = req.getParameter("value");
		
		
		// 쿠키를 생성하자
		Cookie cookie = new Cookie(key, value);
		
		resp.addCookie(cookie);
		
		// 유효시간(만료시간) - 초단위
		cookie.setMaxAge(60); // 1분
		// 만료시간을 0으로 하면 쿠키를 지우는 것과 같다!
		
		resp.sendRedirect("01_Cookie.jsp");
		
	}
}
