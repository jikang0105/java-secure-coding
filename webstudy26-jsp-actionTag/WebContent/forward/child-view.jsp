<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightgray">
<%= request.getParameter("userAge") %>세
<%= request.getParameter("userName") %>님 19세 미만 전용 페이지 입니다.
<hr>
<%= request.getParameter("command") %><br><br>
<%
		// jsp forward param 한글 정보를 받기 위해 한글처리(디코딩)가 필요하다.
		String info = URLDecoder.decode(request.getParameter("info"), "utf-8");
%>
<%= info %><br><br>
<a href="forward-form.jsp">입장페이지로</a>
</body>
</html>