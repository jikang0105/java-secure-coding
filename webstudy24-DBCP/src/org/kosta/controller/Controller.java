package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 개별 컨트롤러 객체를 표준화하는 인터페이스이다.
 * 컨트롤러 구현체를 사용하는 측에서 단일한 방법(추상메서드)으로
 * 다양한 컨트롤러 구현체를 실행시킬 수 있도록 계층구조를 형성하는 역할을 한다.
 */
public interface Controller {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
