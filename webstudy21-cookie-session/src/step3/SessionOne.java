package step3;

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
 * Servlet implementation class SessionOne
 */
@WebServlet("/SessionOne")
public class SessionOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>" + getServletName() + "<br>");
		// 기존 세션이 없으면 새로 세션을 생성하고 기존 세션이 있으면 기존세션을 반환한다.
		HttpSession session = request.getSession();
		// 세션 객체에 정보를 할당한다.
		session.setAttribute("nick", "야 이 새끼야 이거 방탄유리야!!!!");
		session.setAttribute("time", new Date());
		// 내부적으로 이 세션 아이디가 클라이언트에 쿠키로 저장된다.
		out.println(session.getId() + "<br>");
		out.println("<a href = SessionTwo>SessionTwo에서 확인</a>");
		out.println("<br><a href = sessiontest2.jsp>sessiontest2.jsp에서 확인</a>");
		out.println("</h3>");
		out.close();
	}

}
