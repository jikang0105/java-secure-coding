package org.kosta.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CompanyDAO;
import org.kosta.model.EmployeeVO;

public class EmployeeListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		ArrayList<EmployeeVO> list = CompanyDAO.getInstance().getAllEmployList();
		request.setAttribute("list", list);
		return "employee-list.jsp";
	}

}
