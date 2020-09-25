package org.kosta.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class HomeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String url = null;
		ArrayList<ItemDTO> list = ItemDAO.getInstance().getAllItemList();
		request.setAttribute("list", list);
		// layout 적용되면서 item/item-list.jsp가 메인화면으로 제공된다.
		request.setAttribute("url", "/item/item-list.jsp");
		url = "/template/layout.jsp";
		return url;
	}

}
