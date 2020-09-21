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
		MemberVO vo = MemberDAO.getInstance().login(new MemberVO(id, password, null, null));
		if(vo == null) {
			return "/member/login-fail.jsp";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("mvo", vo);
			//request.setAttribute("url", "/member/login-ok.jsp");
			//return "/template/login-layout.jsp";
			return "redirect:front?command=home";
		}
	}

}
