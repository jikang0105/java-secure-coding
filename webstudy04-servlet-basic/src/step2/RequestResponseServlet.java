package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestResponseServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		//client가 보낸 정보를 반환받는다.
		// http://ip:port/serverProgramUrl?name=value 형태로 반환받는다.
		String name = request.getParameter("userName");
		out.print("클라이언트가 보낸 메세지 : " + name);
		out.close();
	}
}
