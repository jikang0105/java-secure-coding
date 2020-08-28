package controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.MockDAO;

/**
 * Servlet implementation class RegistCarServlet
 */
@WebServlet("/RegistCarServlet")
public class RegistCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  {
		// post 방식 한글 인코딩
		try {
			String id = request.getParameter("carId");
			String name = request.getParameter("owner");
			String model = request.getParameter("model");
			String address = request.getParameter("address");
			CarVO vo = new CarVO(id, name, model, address);
			MockDAO.getInstance().registCar(vo);
			// request.setAttribute("registcar", vo); // 의미 없음. forword시에만 사용한다.
			response.sendRedirect("car-regist-result.jsp");
			// 클라이언트가 재요청시 동작이 반복될 수 있다 (insert 시에는 적합하지 않다)
			// request.get.RequestDispatcher("car-register-result.jsp").forward(requset, resposne);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
