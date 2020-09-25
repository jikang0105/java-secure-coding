package org.kosta.controller;

import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.ItemDTO;

public class DeleteItemController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		HttpSession session = request.getSession(false);
		HashMap<String,ItemDTO> cart = null;
		if(session.getAttribute("cart") != null) {
			cart = (HashMap<String, ItemDTO>) session.getAttribute("cart");
			cart.remove(request.getParameter("deleteItemNo"));
		} 
		/* 총액계산
		 * int totalPrice = 0; 
		 * for(Map.Entry<String, ItemDTO> entry : cart.entrySet()) {
		 * 		totalPrice += entry.getValue().getPrice();
		 * }
		 * session.setAttribute("totalPrice", totalPrice);
		 */
		
		return "front?command=cartList";
	}

}
