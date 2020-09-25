package org.kosta.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class AddIntoCartController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String url = null;
		ItemDTO idto = ItemDAO.getInstance().findItemByNo(request.getParameter("inputedItem"));
		HashMap<String, ItemDTO> cart = null;
		HttpSession session = request.getSession(false);
		if(session.getAttribute("cart") == null) {
			cart = new HashMap<String,ItemDTO>();
			session.setAttribute("cart", cart);
			System.out.print("map 생성");
		} else {
			cart = (HashMap<String, ItemDTO>) session.getAttribute("cart");
			System.out.print("map 불러오기");
		}
		if(cart.containsKey(idto.getItemNo())) {
			// 아이템 중복됨
			url = "/item/addIntoCart-fail.jsp";
			System.out.print("아이템 중복");
		} else {
			// 아이템 담기 완료
			cart.put(idto.getItemNo(), idto);
			/* session.setAttribute("cart", cart); */
			url = "/item/addIntoCart-ok.jsp";
			System.out.print("아이템 담기");
		}
		/* 총액계산
		 * int totalPrice = 0; 
		 * for(Map.Entry<String, ItemDTO> entry : cart.entrySet()) {
		 * 		totalPrice += entry.getValue().getPrice();
		 * }
		 * session.setAttribute("totalPrice", totalPrice);
		 */
		return url;
	}

}
