<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품전체조회</title>
<link rel = "stylesheet" type = "text/css" href = "css/mystyle.css">
</head>
<body>
<table>
	<thead>
		<tr>
			<th>ID</th><th>NAME</th>
		</tr>
	</thead>
	<tbody>
	<% 
		ArrayList<ProductVO> list = (ArrayList<ProductVO>)request.getAttribute("listall");
		for(int i = 0; i < list.size(); i++){
	%>
		<tr>
			<td><%= list.get(i).getId() %></td>
			<td><%= list.get(i).getName() %></td>					
		</tr>
	<% } %>
	</tbody>
</table>
</body>
</html>