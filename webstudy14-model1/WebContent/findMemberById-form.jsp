<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findMemberById-form</title>
</head>
<body>
<form method = "get" action = "findMemberById-action.jsp">
회원아이디 <input type = "text" name = "memberId" required = "required">
<input type = "submit" value = "검색">
</form>
<%--
	전송한 아이디에 해당하는 회원이 있으면
	아이디 : java
	이름 : 아이유
	주소 : 판교
	
	없으면
	alert()으로 'model2 아이디에 해당하는 회원이 없습니다. 호출 후
	findMemberById-from.jsp로 다시 이동시킨다.
	
	개발 단계 
	step1. MemberDAO -> findMemberById(String id) : MemberVO
	step2. findMemberById-action.jsp를 구현한다.
 --%>
</body>
</html>