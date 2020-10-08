<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>   
<%--
		command=updateMember -- UpdateMemberController -- MemberDAO updateMember()
											|  db에 member 정보와 session 의 member 정보를 함께 수정 
											|
										    | redirect 
										    |
										 UpdateMemberResultController 
										   | forward 
										 update-result.jsp  ( login-layout이 적용된 화면 ) 
										 회원정보수정 완료 
										 아이디 
										 이름 
										 주소 
 --%>  
<form action="front" method="post">
<input type="hidden" name="command" value="updateMember">
아이디 <input type="text" name="id" value="${sessionScope.mvo.id}" readonly="readonly"><br>
패스워드 <input type="text" name="password" value="${sessionScope.mvo.password}" required="required"><br>
이름 <input type="text" name="name" value="${sessionScope.mvo.name}" required="required"><br>
주소 <input type="text" name="address" value="${sessionScope.mvo.address}" required="required"><br>
<input type="submit" value="수정하기">
</form>



