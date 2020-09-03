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
		String url = null;
		if(session!=null&&session.getAttribute("vo")!=null) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			// DB에 update
			MemberDAO.getInstance().updateMember(new MemberVO(id, password, name, address));
			url = "redirect:update-result.jsp";
			// session = request.getSession();
			// session에 update
			session.setAttribute("vo", new MemberVO(id, password, name, address));			
		} else {
			url = "redirect:index.jsp";
		}
		return url;
	}

}
