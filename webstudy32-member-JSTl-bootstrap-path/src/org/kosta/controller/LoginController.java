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
		MemberVO mvo = MemberDAO.getInstance().login(new MemberVO(request.getParameter("id"), request.getParameter("password"), null, null));
		String url = null;
		if(mvo != null) {
			request.getSession().setAttribute("mvo", mvo);
			url = "redirect:front?command=home";			
		} else {
			url = "redirect:member/login-fail.jsp";
		}
		return url;
	}

}
