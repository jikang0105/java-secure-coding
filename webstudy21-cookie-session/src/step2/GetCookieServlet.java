package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieServlet
 */
@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h4>");
		out.println(getServletName()+"에서 클라이언트로부터 time 쿠키 정보 확인<br><br>");
		// client에 저장된 time 쿠키 정보를 반환받아 본다.
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().contentEquals("time")) {
					out.println(cookies[i].getValue());
				}
			}
		} else {
			out.println("쿠키정보가 없습니다");
		}
		out.println("</h4>");
		out.close();
		
	}

}
