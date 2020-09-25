package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberVO memberVO = MemberDAO.getInstance().login(id, password);
		String url ="";
		if(memberVO != null) {
			url = "redirect:front?command=getAllPostList";
			HttpSession session = request.getSession();
			session.setAttribute("memberVO", memberVO);
		} else {
			url = "/member/login-fail.jsp";
		}
		return url;
	}

}
