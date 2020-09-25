package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WritePostResultController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		request.setAttribute("url", "/board/write-post-ok.jsp");
		return "/template/layout.jsp";
	}

}
