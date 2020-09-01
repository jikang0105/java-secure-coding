<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<h3>Model2 회원관리</h3>
<a href="findmemberbyid.jsp">회원검색</a><br>
<%
	HttpSession session = request.getSession(false);
	if(session != null && session.getAttribute("vo") != null){
		MemberVO vo = (MemberVO)session.getAttribute("vo");
%>
<%= vo.getAddress() %>에 사는 <%= vo.getName() %>님 로그인상태입니다.<br>
<a href = "front?command=logout">로그아웃</a>
<!-- <form action="front">
<input type="hidden" name="command" value="logout">
<input type="submit" value="로그아웃"> 
</form> -->
<% } else { %>
<a href="joinmember.jsp">회원가입</a><br>
<a href="login.jsp">로그인</a><br>
<% } %>
</div>
</body>
</html>