package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MoveToController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("cart") != null) {
			request.setAttribute("url", "/item/cart-list.jsp");
		}
		return "/template/layout.jsp";
	}

}
