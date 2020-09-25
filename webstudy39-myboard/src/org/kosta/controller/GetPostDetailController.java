package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.PostVO;

public class GetPostDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String no = request.getParameter("no");		
		PostVO postVO = BoardDAO.getInstance().getPostDetail(no);
		request.setAttribute("postVO", postVO);
		request.setAttribute("url", "/board/post-detail.jsp");
		return "/template/layout.jsp";
	}

}
