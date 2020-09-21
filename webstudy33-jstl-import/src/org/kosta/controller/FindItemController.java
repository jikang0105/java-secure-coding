package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindItemController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		request.setAttribute("product", "참이슬 후레쉬");
		request.setAttribute("url", "/product/find-item-result.jsp");
		return "template/layout.jsp";
	}

}
