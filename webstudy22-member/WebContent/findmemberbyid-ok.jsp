<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find ok</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<div class="container">
		<a href="index.jsp">Home</a>
		<hr>
		<%
			MemberVO vo = (MemberVO) request.getAttribute("vo");
		%>
		<table>
			<tr>
				<td>ID</td><td><%=vo.getId() %></td>
			</tr>
			<tr>
				<td>NAME</td><td><%=vo.getName() %></td>
			</tr>
			<tr>
				<td>ADDRESS</td><td><%=vo.getAddress() %></td>
			</tr>
		</table>
	</div>
</body>
</html>














