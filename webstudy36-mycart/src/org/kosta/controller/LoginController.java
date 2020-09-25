package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberDTO dto = MemberDAO.getInstance().login(new MemberDTO(id, password, null, null));
		if(dto == null) {
			return "/member/login-fail.jsp";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("memberDTO", dto);
			//request.setAttribute("url", "/member/login-ok.jsp");
			//return "/template/login-layout.jsp";
			return "redirect:front?command=home";
		}
	}

}
