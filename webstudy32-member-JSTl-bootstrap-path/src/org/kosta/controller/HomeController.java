package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class HomeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		int count = MemberDAO.getInstance().getMemberTotalCount();
		request.setAttribute("count", count);
		return "home.jsp";
	}

}
