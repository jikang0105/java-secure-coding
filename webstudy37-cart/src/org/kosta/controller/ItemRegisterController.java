package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class ItemRegisterController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String itemName = request.getParameter("itemName");
		String itemMaker = request.getParameter("itemMaker");
		int itemPrice = Integer.parseInt(request.getParameter("itemPrice"));
		String itemDetail = request.getParameter("itemDetail");
		ItemDAO.getInstance().registerItem(new ItemDTO(null, itemName, itemMaker, itemPrice, itemDetail));
		return "redirect:item/item-register-result.jsp";
	}

}
