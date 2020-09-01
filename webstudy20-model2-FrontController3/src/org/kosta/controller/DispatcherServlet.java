package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/front")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *  DispatcherServlet : 모든 클라이언트가 FrontController인 DispatcherServlet으로 요청한다.
     *  Front Controller Pattern : 모든 클라이언트의 요청을 하나의 진입점으로 집중시켜 일괄적으로 처리하기 위한 디자인 패턴이다.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.handleRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.handleRequest(request, response);
	}
	/*
	 *  1. 에러 정책 : 에러 발생시 클라이언트에게 error.jsp로 응답하고, 에러메세지는 서버상의 콘솔에서만 보여준다.
	 *  2. client가 보낸 command를 받아온다
	 *  3. 실제 controller logic을 구현한 개별 controller object를 create object를 전담하는 HandlerMapping에게 의뢰해서 컨트롤러 객체를 반환받는다.
	 *  4. 개별 컨트롤러 객체의 구체적인 수행 내용을 알 필요 없이 Controller 인터페이스의 추상메서드인 execute(request, response) 메서드를 호출하여 개별 컨트롤러 로직을 실행시킨다.
	 *  5. 실행 후 반환되는 url 정보를 기반으로 클라이언트에게 응답하기 위한 view로 이동하 방식을 선택해서 이동시킨다.
	 */
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			String command = request.getParameter("command");
			Controller controller = HandlerMapping.getInstance().create(command);
			String url = controller.execute(request, response).trim();
			if(url.startsWith("redirect:")) {
				response.sendRedirect(url.substring(9));
			}else {
				request.getRequestDispatcher(url).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}//catch
	}//method

}// class
