package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;

public class WritePostController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String ptitle = request.getParameter("ptitle");
		String pcontent = request.getParameter("pcontent");
		String memberId = request.getParameter("memberId");
		BoardDAO.getInstance().writePost(ptitle, pcontent, memberId);
		return "redirect:front?command=writePostResult";
	}

}
