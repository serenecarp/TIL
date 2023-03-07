package com.ssafy.myservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// 해당 클래스를 서블릿으로 만들기 위해서는
// Servelt (인터페이스) 구현해야 함

public class MyServlet1 implements Servlet {

	@Override
	public void destroy() {
		// 서블릿이 파괴될 때 동작

	}

	@Override
	public ServletConfig getServletConfig() {
		// 뭔가 서블릿 설정 같은 걸 건드리는 애
		return null;
	}

	@Override
	public String getServletInfo() {
		// 서블릿 정보
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// 서블릿을 초기화할 때

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 클라이언트로부터 요청이 들어왔다면 처리해주는 애

	}

}
