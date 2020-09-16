package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class checkIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String userId = request.getParameter("userId");
		boolean flag = MemberDAO.getInstance().checkId(userId);
		if(flag) {
			return "checkId_pass.jsp";
		} else {
			return "checkId_fail.jsp";
		}
	}

}
