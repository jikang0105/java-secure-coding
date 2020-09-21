package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByIdContorller implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id = request.getParameter("id");
		MemberVO mvo = MemberDAO.getInstance().findMemberById(id);
		String url = null;
		if(mvo != null) {
			url = "findMemberById-ok.jsp";
			request.setAttribute("mvo", mvo);
		} else {
			url = "findMemberById-fail.jsp";
		}
		return url;
	}

}
