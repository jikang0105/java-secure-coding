package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class SelectProductByMakerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String maker = request.getParameter("maker");
		ArrayList<ProductVO> list = ProductDAO.getInstance().selectProductByMaker(maker);
		request.setAttribute("selectbymaker", list);
		return "select-by-maker.jsp";
	}

}
