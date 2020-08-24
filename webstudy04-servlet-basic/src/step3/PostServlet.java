package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답시 컨텐트 타입 및 한글 처리를 설정한다.
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		// post 방식은 url로 데이터가 전달되는 것이 아니라 http request body 영역에 저장되어 전달되므로 한글처리를 한다.
		request.setCharacterEncoding("utf-8");
		// 클라이언트 메세지 : client message
		String message = request.getParameter("message");
		out.print("클라이언트가 보낸 메세지 : " + message);
		
		out.close();
	}
}
