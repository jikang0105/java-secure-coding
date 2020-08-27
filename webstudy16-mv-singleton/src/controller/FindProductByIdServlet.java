package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductVO;

/**
 * Servlet implementation class FindProductByIdServlet
 */
@WebServlet("/FindProductByIdServlet")
public class FindProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("productId");
			ProductVO vo = ProductDAO.getInstance().findProductById(id);
			String viewName = null;
			if(vo==null) {
				viewName = "find_fail.jsp";
//				request.getRequestDispatcher("find_fail.jsp").forward(request, response);
			}else {
				viewName = "find_ok.jsp";
				request.setAttribute("result", vo);
//				request.getRequestDispatcher("find_ok.jsp").forward(request, response);
			}
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
