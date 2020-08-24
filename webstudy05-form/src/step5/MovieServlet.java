package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MovieServlet
 */
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String[] movie = request.getParameterValues("movie");
		out.print("선택한 영화 : ");
		for(int i = 0; i < movie.length; i++) {
			out.print(movie[i] + " ");
		}
	}

}
