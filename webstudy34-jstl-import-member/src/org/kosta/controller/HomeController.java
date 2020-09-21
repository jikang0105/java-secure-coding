package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;

public class HomeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		int count = MemberDAO.getInstance().getMemberTotalCount();
		request.setAttribute("count", count);
		// 로그인한 사용자와 로그인 하지 않은 사용자를 구분해서 home화면을 제공한다.
		String url = null;
		HttpSession session=request.getSession(false);
		if(session != null && session.getAttribute("mvo") != null) { // 로그인한 사용자
			url = "/template/login-layout.jsp";
		} else { // 로그인 하지 않은 사용자
			url = "/template/layout.jsp";
		}
		// 웹 디자인 레이아웃이 적용된 화면으로 응답하기 위해 template/layout.jsp에 있는
		// 아래 코드 부분에 화면정보를 할당한 후 <c:import url="${requestScope.url}"/>
		// layout.jsp로 forward한다.
		request.setAttribute("url", "/home.jsp");
		return url;
	}

}
