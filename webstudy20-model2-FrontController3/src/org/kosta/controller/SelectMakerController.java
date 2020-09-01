package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;

public class SelectMakerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<String> list = (ArrayList<String>)ProductDAO.getInstance().getMakerList();
		request.setAttribute("makerlist", list);
		return "select-maker-form.jsp";
	}

}
