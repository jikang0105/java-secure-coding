package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		out.println("주문항목<br><br>");
		String menu = request.getParameter("menu");
		int count = Integer.parseInt(request.getParameter("count"));
		out.print(menu + " " + count + "인분" + "<br>");
		if(count >= 3) {
			out.println("서비스 소주 2병");
		}
		out.close();
	}
}
