package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		String kind = request.getParameter("kind");
		out.print("주문완료 : " + kind);
		out.close();
	}

}
