package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class ItemDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		ItemDTO idto = ItemDAO.getInstance().findItemByNo(request.getParameter("itemNo"));
		request.setAttribute("idto", idto);
		request.setAttribute("url", "/item/item-detail.jsp");
		return "/template/layout.jsp";
	}

}
