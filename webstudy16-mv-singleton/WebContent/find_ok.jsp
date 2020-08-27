<%@page import="model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find_ok.jsp</title>
<link rel = "stylesheet" type = "text/css" href = "css/mystyle.css">
</head>
<body>
<%
	ProductVO vo = (ProductVO)request.getAttribute("result");
%>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>MAKER</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%=vo.getId() %></td>
				<td><%=vo.getName() %></td>
				<td><%=vo.getMaker() %></td>
				<td><%=vo.getPrice() %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>