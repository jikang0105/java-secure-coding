<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제조사 리스트</title>
</head>
<body>
	<form action = "front">
	<input type = "hidden" name = "command" value = "selectProductByMaker">
	<%
		ArrayList<String> list = (ArrayList<String>)request.getAttribute("makerlist");
		for(int i = 0; i < list.size(); i++){
	%>	
		<input type = "radio" name = "maker" value = "<%= list.get(i) %>"><%= list.get(i) %><br>
	<% } %>
		<input type = "submit" value = "제조사로 제품 검색">
	</form>	
	
</body>
</html>