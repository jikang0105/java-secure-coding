package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByIdContorller implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id = request.getParameter("id");
		MemberVO mvo = MemberDAO.getInstance().findMemberById(id);
		String url = null;
		if(mvo != null) {
			// 아래의 jsp는 member 디렉토리 안에 있으므로 
			// 디렉토리명까지 기술해야한다.
			url = "member/findbyid-ok.jsp";
			request.setAttribute("mvo", mvo);
		} else {
			url = "member/findbyid-fail.jsp";
		}
		return url;
	}

}
