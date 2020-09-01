package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pass = request.getParameter("password");
		MemberVO vo = MemberDAO.getInstance().login(id, pass);
		// request.setAttribute("loginmember", vo);
		String url = null;
		if(vo == null) {
			url = "redirect:login-fail.jsp";
		} else {
			url = "redirect:login-ok.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("vo", vo);
			//session.setAttribute("name", vo.getName());
			//session.setAttribute("address", vo.getAddress());
		}
		return url;
	}

}
