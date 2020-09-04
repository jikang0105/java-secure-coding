package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class productListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<ProductVO> productList = (ArrayList<ProductVO>)ProductDAO.getInstance().getAllProductList();
		request.setAttribute("productlist", productList);
		return "product-list.jsp";
	}

}
