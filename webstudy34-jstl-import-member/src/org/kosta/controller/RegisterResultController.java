package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class RegisterResultController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		request.setAttribute("url", "/member/register-result.jsp");
		MemberVO mvo =MemberDAO.getInstance().findMemberById(request.getParameter("userId"));
		/*
		 * String userName=null;
		 * 
		 * try { userName = URLDecoder.decode(request.getParameter("userName"),
		 * "utf-8"); } catch (UnsupportedEncodingException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		request.setAttribute("userName", mvo.getName());
		//System.out.println(request.getParameter("userId"));
		//request.setAttribute("mvo", mvo);
		return "template/layout.jsp";
	}

}
