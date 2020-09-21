package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class UpdateMemberController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id = request.getParameter("id");
		String updatePass = request.getParameter("updatePass");
		String updateName = request.getParameter("updateName");
		String updateAddress = request.getParameter("updateAddress");
		MemberVO mvo = new MemberVO(id, updatePass, updateName, updateAddress);
		MemberDAO.getInstance().updateMember(mvo);
		HttpSession session = request.getSession(false);
		if(session==null || session.getAttribute("mvo")==null) {
			return "redirect:fornt?command=home";
		} else {
			session.setAttribute("mvo", mvo); // session에 회원정보를 업데이트
			return "redirect:front?command=updateMemberResult";
		}
	}

}
