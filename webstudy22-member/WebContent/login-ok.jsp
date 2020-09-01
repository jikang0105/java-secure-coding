<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<%
	//MemberVO vo = (MemberVO)request.getAttribute("loginmember");
	HttpSession session = request.getSession(false);
	if(session != null){
		MemberVO vo = (MemberVO)session.getAttribute("vo");
		if(vo != null){
%>
<%= vo.getName() %>님 로그인하셨습니다.
<%
		}
	}
%>
</div>
</body>
</html>