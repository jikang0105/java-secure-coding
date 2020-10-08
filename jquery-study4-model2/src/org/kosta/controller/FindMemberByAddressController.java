package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByAddressController implements Controller {	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// Ajax 방식으로 응답(JSONArray)
		String address=request.getParameter("address");
		ArrayList<MemberVO> list = MemberDAO.getInstance().findMemberListByAddress(address);
		JSONArray ja=new JSONArray(list);
		request.setAttribute("responsebody", ja);
		return "AjaxView";
	}
}











