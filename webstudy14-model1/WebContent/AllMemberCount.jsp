<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>총회원수</title>
</head>
<body>
<%
	MemberDAO dao = new MemberDAO();
%>
총회원수 <%= dao.getAllMemberCount() %> 명
</body>
</html>