<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
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
<a href="index.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="register-form.jsp">상품등록</a>&nbsp;&nbsp;&nbsp;
<a href="front?command=productList">상품목록</a>&nbsp;&nbsp;&nbsp;
<hr>
<table>
<% ProductVO pvo = (ProductVO)request.getAttribute("pvo"); %>
	<tr>
		<td>ID</td>
		<td><%= pvo.getId() %></td>
	</tr>
	<tr>
		<td>NAME</td>
		<td><%=pvo.getName() %></td>
	</tr>
	<tr>
		<td>MAKER</td>
		<td><%=pvo.getMaker() %></td>
	</tr>
	<tr>
		<td>PRICE</td>
		<td><%=pvo.getPrice() %></td>
	</tr>
	<tr>
		<td>REGISTER DATE</td>
		<td><%= pvo.getRegDate() %></td>
	</tr>
</table>

</div>
</body>
</html>