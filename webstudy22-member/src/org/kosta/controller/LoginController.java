package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String url=null;
		MemberVO mvo=MemberDAO.getInstance().login(new MemberVO(id,password));
		if(mvo==null)
			url="redirect:login-fail.jsp";
		else {//로그인 성공
			url="redirect:login-ok.jsp";
			HttpSession session=request.getSession();
			session.setAttribute("mvo", mvo);
		}
		return url;
	}

}















