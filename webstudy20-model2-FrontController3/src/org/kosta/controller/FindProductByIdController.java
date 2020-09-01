package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class FindProductByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * step1. 클라이언트가 전달한 상품아이디를 반환받는다.
		 * step2. 모델과 연동한다( ProductDAO의 findProductById(id))
		 * step3. 연동 결과에 의해 상품정보가 존재하지 않으면 find-fail.jsp로 이동시킨다(forward)
		 * step4. 상품정보가 존재하면 request에 공유하고 find-ok.jsp로 이동시킨다(forward)
		 */
		String id = request.getParameter("productId");
		ProductVO vo = ProductDAO.getInstance().findProductById(id);
		String url = null;
		if(vo == null) {
			url = "find-fail.jsp";
		} else {
			request.setAttribute("productInfo", vo);
			url = "find-ok.jsp";
		}
		return url;
	}

}
