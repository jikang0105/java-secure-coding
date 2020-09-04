package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class ProductDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		ProductVO pvo = ProductDAO.getInstance().findProductById(id);
		request.setAttribute("pvo", pvo);
		return "detail-product.jsp";
	}

}
