package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class JoinController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id = request.getParameter("userId");
		String pass = request.getParameter("userPass");
		String name = request.getParameter("userName");
		String address = request.getParameter("address");
		String birth = request.getParameter("birth");
		MemberVO mvo = new MemberVO(id, pass, name, address, birth);
		MemberDAO.getInstance().join(mvo);
		return "redirect:join_result.jsp";
	}

}
