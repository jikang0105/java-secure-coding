package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionThree
 */
@WebServlet("/SessionThree")
public class SessionThree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>" + getServletName() + "<br>");
		// 기존 세션이 있는지 확인해서 있으면 세션을 무효화시킨다.(로그아웃 기능)
		// request.getSession(false) : 기존 세션이 있으면 반환하고 없으면 null을 리턴한다.
		HttpSession session = request.getSession(false);
		if(session != null) { //세션이 있으면
			session.invalidate(); // 세션을 무효화시킨다.
			out.println("기존 세션을 무효화시켰습니다.(로그아웃..)");
		} else {
			out.println("세션이 없습니다.");
		}
		out.println("<br><a href = SessionTwo>SessionTwo에서 확인</a>");
		out.println("<br><a href = SessionOne>SessionOne에서 확인</a>");
		out.println("</h3>");
		out.close();
	}

}
