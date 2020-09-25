package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.PostVO;

public class UpdatePostFormController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String postNumber = request.getParameter("postNumber");
		PostVO postVO = BoardDAO.getInstance().getPostDetail(postNumber);
		request.setAttribute("postVO", postVO);
		request.setAttribute("url", "/board/update-post-form.jsp");
		return "/template/layout.jsp";
	}

}
