package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class RegisterController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * System.out.println("회원가입처리"); request.setAttribute("url",
		 * "/member/register-result.jsp"); return "/template/layout.jsp";
		 */
		// 위와 같은 방식은 회원가입에는 적절하지 않다 
		// forward 방식으로 응답하면 사용자가 재동작 시킬 경우 
		// 다시 가입을 시도하기 때문. 
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		MemberDAO.getInstance().register(new MemberVO(id,password,name,address));
		return "redirect:front?command=registerResult&id="+id;
	}
}











