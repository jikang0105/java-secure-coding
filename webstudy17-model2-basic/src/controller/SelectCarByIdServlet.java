package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.MockDAO;


@WebServlet("/SelectCarByIdServlet")
public class SelectCarByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("carId");
			CarVO vo = MockDAO.getInstance().selectCarById(id);
			request.setAttribute("car", vo);
			String path = null;
			if(vo == null) {
				path = "selectcar-fail.jsp";
			} else {
				path = "selectcar-ok.jsp";
			}
			request.getRequestDispatcher(path).forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
