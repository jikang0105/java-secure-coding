package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;

public class UpdatePostController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String postNumber = request.getParameter("postNumber");
		String ptitle = request.getParameter("ptitle");
		String pcontent = request.getParameter("pcontent");
		BoardDAO.getInstance().updatePost(postNumber, ptitle, pcontent);
		return "redirect:board/update-post-ok.jsp";
	}

}
