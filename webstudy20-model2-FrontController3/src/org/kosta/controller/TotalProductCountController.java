package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;

public class TotalProductCountController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// step1. model과 연동한다.
		// step2. 연동 결과를 view와 공유하기 위해 request.setAttribute(name,value)
		// step3. 응답 방식 및 응답 url을 반환한다.
		int totalCount = ProductDAO.getInstance().getTotalProductCount();
		request.setAttribute("totalCount", totalCount);
		return "count-view.jsp";
	}

}
