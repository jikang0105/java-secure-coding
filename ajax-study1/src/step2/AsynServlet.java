package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsynServlet
 */
@WebServlet("/AsynServlet")
public class AsynServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 *   비동기 통신의 예(ajax 방식), step2-asyn.jsp와 연동한다.
	 *   ajax 방식의 응답은 페이지 응답이 아니라 필요한 데이터만 응답한다.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		// ajax 비동기 통신 응답이므로 필요한 데이터만 응답한다.
		out.println("ajax 응답");
		out.close();
	}

}
