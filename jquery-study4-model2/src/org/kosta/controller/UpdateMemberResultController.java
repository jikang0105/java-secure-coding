package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateMemberResultController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// layout 적용된 화면을 제공 
		request.setAttribute("url", "/member/update-result.jsp");
		return "/template/layout.jsp";
	}

}
