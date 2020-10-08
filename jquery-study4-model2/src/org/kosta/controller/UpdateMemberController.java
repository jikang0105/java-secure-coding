package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class UpdateMemberController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		MemberVO vo=new MemberVO(id,password,name,address);
		MemberDAO.getInstance().updateMember(vo);
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null) {
			return "redirect:front?command=home";
		}else {
			session.setAttribute("mvo", vo);//session에 회원정보를 업데이트 
			return "redirect:front?command=updateMemberResult";
		}		
	}

}












