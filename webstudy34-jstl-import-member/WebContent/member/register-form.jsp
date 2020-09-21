<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- 
			command=register -- RegisterController -- MemberDAO register
												|
												| redirect(재동작방지)
												|
											RegisterResultController
												| forward
											member/register-result.jsp (레이아웃이 적용되어야 함)
 --%>
<form action="${pageContext.request.contextPath}/front" method="post">
	<input type="hidden" name="command" value="register">
	아이디 : <input type="text" name="userId" required="required"><br>
	비밀번호 : <input type="password" name="userPass" required="required"><br>
	이름 : <input type="text" name="userName" required="required"><br>
	주소 : <input type="text" name="userAddress" required="required"><br>
	<input type="submit" value="회원가입">
</form>