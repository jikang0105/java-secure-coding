package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Two() {
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
		// One Servlet에서 ServletContext에 할당한 nick 정보를 반환받아본다.
		String nick = (String)getServletContext().getAttribute("nick"); // ServletContext에는 어떤정보도 들어갈 수 있으므로 Object로 들어간다.
		out.println("<br>ServletContext로부터 One이 할당한 nick을 반환받아옴 : " + nick);
		out.println("<br><br><a href = One> One 서블릿 실행</a>");
		out.println("<br><br><a href = contextTest.jsp>contestTest.jsp 실행</a>");
		out.close();

	}

}
