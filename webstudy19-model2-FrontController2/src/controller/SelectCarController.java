package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.MockDAO;

public class SelectCarController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = null;
		String id = request.getParameter("carId");
		CarVO vo = MockDAO.getInstance().selectCarById(id);
		if(vo==null) {
			url = "selectcar-fail.jsp";
		} else {
			url = "selectcar-ok.jsp";
			request.setAttribute("car", vo);
		}
		return url;
	}

}
