package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class loginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		MemberVO mvo=MemberDAO.getInstance().login(new MemberVO(userId, userPass));
		String url = null;
		if(mvo != null) {
			url = "front?command=countMember";
			HttpSession session = request.getSession();
			session.setAttribute("mvo", mvo);
		} else {
			url = "login_fail.jsp";
		}
		return url;
	}

}
