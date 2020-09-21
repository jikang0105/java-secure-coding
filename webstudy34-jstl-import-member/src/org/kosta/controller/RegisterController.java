package org.kosta.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class RegisterController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// forward 방식은 회원가입에는 적절하지 않다.
		// forward 방식으로 응답하면 사용자가 재동작 시킬 경우 다시 가입을 시도하기 때문이다.

		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		String userName = request.getParameter("userName");
		String userAddress = request.getParameter("userAddress");
		MemberDAO.getInstance().register(new MemberVO(userId, userPass, userName, userAddress));
		/*
		 * try { userName=URLEncoder.encode(userName, "utf-8"); } catch
		 * (UnsupportedEncodingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		return "redirect:front?command=registerResult&userId=" + userId;
	}

}
