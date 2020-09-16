package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CarDAO2;
import org.kosta.model.CarDTO;

public class FindCarByNoController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String carNo = request.getParameter("carNo");
		CarDTO cdto = CarDAO2.getInstance().findCarByNo(carNo);
		String url = null;
		if(cdto != null) {
			url = "findCar-ok.jsp";
			request.setAttribute("cdto", cdto);
		} else {
			url = "findCar-fail.jsp";
		}
		return url;
	}

}
