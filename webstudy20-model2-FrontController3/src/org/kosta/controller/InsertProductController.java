package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class InsertProductController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProductVO vo = new ProductVO();
		vo.setName(request.getParameter("productName"));
		vo.setMaker(request.getParameter("productMaker"));
		vo.setPrice(Integer.parseInt(request.getParameter("productPrice")));
		ProductDAO.getInstance().insertProduct(vo);	
		return "redirect:insert-ok.jsp";
	}

}
