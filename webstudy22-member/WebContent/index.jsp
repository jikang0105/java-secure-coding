<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
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
		if (session != null && session.getAttribute("mvo") != null) {
			MemberVO mvo = (MemberVO) session.getAttribute("mvo");
		%>
			<%=mvo.getAddress() %>에 사는 <%=mvo.getName() %>님 로그인 상태<br>
			<a href="front?command=logout">로그아웃</a><br>
			<a href="update-form.jsp">회원정보수정</a><br>
		<%
			} else {
		%>
			<a href="login.jsp">로그인페이지로</a><br>
			<a href="register-form.jsp">회원가입</a>
		<%
			}
		%>
	</div>
</body>
</html>















