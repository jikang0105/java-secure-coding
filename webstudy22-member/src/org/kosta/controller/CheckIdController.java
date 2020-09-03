package org.kosta.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;


public class CheckIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		Boolean flag = MemberDAO.getInstance().checkId(id);
		String url = null;
		if(flag) {
			url = "idcheck-fail.jsp";
		} else {
			url = "idcheck-ok.jsp";
		}
		return url;
	}

}
