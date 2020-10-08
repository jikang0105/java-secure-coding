package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class IdCheckController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		boolean flag = MemberDAO.getInstance().idcheck(id);
		String result="fail"; //사용불가
		if(flag==false) {
			result="ok"; // 사용가능
		}
		request.setAttribute("responsebody", result);
		// ajax방식으로 응답한다
		return "AjaxView";
	}

}






