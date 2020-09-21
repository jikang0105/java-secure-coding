package org.kosta.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberListByAddressController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String address = request.getParameter("address");
		ArrayList<MemberVO> list =MemberDAO.getInstance().findMemberListByAddress(address);
		request.setAttribute("list", list);
		return "member/findbyaddress-result.jsp";
	}

}
