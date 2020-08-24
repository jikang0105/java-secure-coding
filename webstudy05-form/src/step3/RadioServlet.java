package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RadioServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String radio = request.getParameter("friend");
		out.print(radio);
		out.close();
	}
}
