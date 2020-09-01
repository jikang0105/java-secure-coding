<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findok</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<% MemberVO vo = (MemberVO)request.getAttribute("member"); %>
아이디  '<%= vo.getId() %>'로 검색한 회원은 다음과 같습니다.<br>
<table>
	<tr>
		<td>ID</td>
		<td><%=vo.getId() %></td>
	</tr>
	<tr>
		<td>NAME</td>
		<td><%=vo.getName() %>
	</tr>
	<tr>
		<td>ADDRESS</td>
		<td><%=vo.getAddress()%></td>
</table>
<a href = index.jsp>Home</a><br>
</body>
</html>