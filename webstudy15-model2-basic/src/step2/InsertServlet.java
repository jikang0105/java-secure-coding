package step2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MockDAO;


@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String info = request.getParameter("customerInfo");
		System.out.println("InsertServlet Controller 실행");
		//Model과 연동해서 Model을 업데이트
		MockDAO dao = new MockDAO();
		dao.insertCustomerInfo(info);
		// forward 방식으로 테스트 : 클라이언트에서 재동작할 경우 다시 정보가 insert되려고 시도하기 때문에 문제가 발생할 수 있으므로 redirect 방식으로 변경한다.
		String viewUrl = "insert-result.jsp";
		//request.getRequestDispatcher(viewUrl).forward(request, response);
		// redirect 방식으로 이동
		response.sendRedirect(viewUrl);// 클라이언트(브라우저)에게 이동을 명령한다.
		
	}

}
