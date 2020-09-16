package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/front")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.handleRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.handleRequest(request, response);
	}
	/*
	 * 1. 에러발생시 콘솔에 메세지 발생 경로 출력하고 error.jsp로 리다이렉트한다.
	 * 2. 클라이언트가 전송한 command 정보를 받는다.
	 * 3. HandlerMapping을 이용해 개별 컨트롤개 객체를 컨트롤러 인터페이스 타입으로 반환받는다.
	 * 4. 개별 컨트롤러를 실행한다.
	 * 5. 실행 후 반환된 String url 정보를 이용해 forward 방식 또는 redirect 방식으로 view로 이동하고 응답하게 한다.
	 */
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			Controller controller = HandlerMapping.getInstance().create(command);
			String url = controller.execute(request, response).trim();
			if(url.startsWith("redirect:")) {
				response.sendRedirect(url.substring(9));
			} else {
				request.getRequestDispatcher(url).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}

}
