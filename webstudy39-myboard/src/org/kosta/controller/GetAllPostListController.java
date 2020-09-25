package org.kosta.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.PostVO;

public class GetAllPostListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		ArrayList<PostVO> list = BoardDAO.getInstance().getAllPostList();		
		request.setAttribute("list", list);
		request.setAttribute("url", "/board/list.jsp");
		return "/template/layout.jsp";
	}

}
