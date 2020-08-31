package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MockDAO;

public class DeleteCarController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		MockDAO.getInstance().deleteCar(id);
		String url = "redirect:delete-car-result.jsp";
				
		return url;
	}

}
