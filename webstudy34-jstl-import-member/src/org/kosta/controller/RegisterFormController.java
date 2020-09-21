package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterFormController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// layout 적용된 회원가입폼 화면이 응답하게 한다.
		request.setAttribute("url", "/member/register-form.jsp");
		return "/template/layout.jsp";
	}

}
