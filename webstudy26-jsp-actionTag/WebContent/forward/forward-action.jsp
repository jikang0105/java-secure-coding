<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward-action.jsp</title>
</head>
<body>
<%
	String name = request.getParameter("userName");
	int age = Integer.parseInt(request.getParameter("userAge"));
	if(age>=19){
%>
<%= age %>세 성인 <%= name %> 입니다.
<% }else{ 
		// jsp forward 액션테그에서 param으로 한글을 전송하기 위해서는
		// 한글 인코딩이 별도로 필요하다
		String info = URLEncoder.encode("테스트", "utf-8");
%>
		<jsp:forward page="child-view.jsp">
		<jsp:param value="list" name="command"/>
		<jsp:param value="<%= info %>" name="info"/>
		</jsp:forward>
<% } %>
</body>
</html>