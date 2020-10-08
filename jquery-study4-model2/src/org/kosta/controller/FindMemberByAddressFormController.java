package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByAddressFormController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("list", MemberDAO.getInstance().getAddressKind());
		// 레이아웃 적용된 페이지로 응답 
		request.setAttribute("url", "/member/findbyaddress-form.jsp");
		return "/template/layout.jsp";
	}

}
