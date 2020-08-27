package step1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MockDAO;

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 컨트롤러는 request분석 후 Model과 연동, 연동 결과를 View에 공유하는 역할
		String id = request.getParameter("userId");
		MockDAO dao = new MockDAO();
		String result = dao.findInfo(id);
		request.setAttribute("result", result); // view에 공유
		System.out.println("**컨트롤러 실행**");
		// View로 이동한다.
		request.getRequestDispatcher("select_result.jsp").forward(request, response);
	}


}
