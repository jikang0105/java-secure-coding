package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDTO;

public class DeleteCartItemController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String url="front?command=home";
		// 비로그인 상태이면
		HttpSession session = request.getSession(false);
		if(session!=null&&session.getAttribute("memberDTO")!=null) {
			MemberDTO dto = (MemberDTO) session.getAttribute("memberDTO");
			String itemNo = request.getParameter("itemNo");
			// 장바구니에서 상품아이템 삭제
			dto.getCart().removeItem(itemNo);
			url="redirect:front?command=cartView";
		}
		return url;
	}

}
