package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.MockDAO;

public class RegistCarController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("carId");
		String owner = request.getParameter("owner");
		String model = request.getParameter("model");
		String address = request.getParameter("address");
		MockDAO.getInstance().registCar(new CarVO(id, owner, model, address));
		return "redirect:car-regist-result.jsp";
	}

}
