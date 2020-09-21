package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id = request.getParameter("id");
		MemberVO mvo = MemberDAO.getInstance().findMemberById(id);
		if(mvo != null) {
			request.setAttribute("url", "/member/findbyid-ok.jsp");
			request.setAttribute("mvo", mvo);
			return "/template/login-layout.jsp";
		} else {
			return "/member/findbyid-fail.jsp";
		}
	}

}
