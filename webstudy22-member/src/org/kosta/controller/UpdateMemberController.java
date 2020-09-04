package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class UpdateMemberController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("mvo") != null) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			MemberVO updateMemberVO=new MemberVO(id,password,name,address);
			//db에 update
			MemberDAO.getInstance().updateMember(updateMemberVO);
			//session에 update
			session.setAttribute("mvo", updateMemberVO);
			return "redirect:update-result.jsp";
		}
		return "redirect:index.jsp";
	}
}








