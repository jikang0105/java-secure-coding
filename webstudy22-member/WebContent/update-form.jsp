<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정폼</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<%
	// 로그인한 사용자인지 확인한다 ( 세션 유무와 세션 내의 인증정보 유무를 체크한다 )
	// request.getSession(false): 기존 세션이 있으면 기존 세션 객체를 리턴하고 없으면 null을 리턴한다.
	HttpSession session = request.getSession(false);
	if(session!=null&&session.getAttribute("vo")!=null){
		MemberVO vo = (MemberVO)session.getAttribute("vo");
%>		
<h4>회원정보수정</h4>
<form method="post" action="front">
	<input type="hidden" name="command" value="updateMember">
	<%-- readonly="readonly" 수정불가 --%>
	아이디 <input type="text" name="id" readonly="readonly" value="<%= vo.getId()%>"><br>
	패스워드 <input type="text" name="password" value="<%= vo.getPassword() %>"><br>
	이름 <input type="text" name="name" value="<%= vo.getName()%>"><br>
	주소 <input type="text" name="address" value="<%= vo.getAddress()%>"><br>
	<input type="submit" value="수정하기">
</form>
<% 	} else {  %>
	로그인이 필요한 서비스입니다. <a href="login.jsp">로그인 페이지로</a>
<% } %>
</div>
</body>
</html>