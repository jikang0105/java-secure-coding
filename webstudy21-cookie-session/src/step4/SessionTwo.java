package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTwo
 */
@WebServlet("/SessionTwo")
public class SessionTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>" + getServletName() + "<br>");
		// 기존 세션이 있으면 기존 세션을 반환하고 없으면 null을 리턴한다.
		// 기존 세션이 있는지 유무를 판단한다.
		HttpSession session = request.getSession(false);
		if(session==null) {
			out.println("세션이 없습니다.<br>");
		} else {
			out.println("세션아이디 : " + session.getId()+"<br>");
			// 세션에서 정보를 반환받아 출력한다.
			String nick = (String)session.getAttribute("nick");
			out.println("nick : " + nick);
			Date time = (Date)session.getAttribute("time");
			out.println("<br>time : " + time.toString() + "<br>");
		}
		out.println("<a href = SessionOne>SessionOne으로 이동 </a><br>");
		out.println("<a href = SessionThree>SessionThree에서 확인</a>");
		out.println("<br><a href = sessiontest1.jsp>sessiontest1.jsp로 이동</a>");
		out.println("</h3>");
		out.close();
	}

}
