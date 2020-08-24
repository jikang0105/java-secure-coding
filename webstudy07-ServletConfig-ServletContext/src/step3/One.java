package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public One() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<h1><br><br><br>");
		String name = getServletConfig().getServletName();
		out.println(name);
		out.println("<br>ServletContext에서 dbUrl을 받았습니다 : ");
		String dbUrl = getServletConfig().getServletContext().getInitParameter("dbUrl");
		out.println(dbUrl);
		// ServletContext에  특정 정보를 할당한다.
		getServletContext().setAttribute("nick","펭수");
		out.println("servletContext에 nick을 할당했습니다.");
		out.println("<br><br><a href = Two> Two 서블릿 실행</a>");
		out.println("<br><br><a href = contextTest.jsp>contestTest.jsp 실행</a>");
		out.close();
	}

}
