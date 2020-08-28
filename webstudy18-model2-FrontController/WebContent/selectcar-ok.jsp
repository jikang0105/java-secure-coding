<%@page import="model.CarVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "css/mystyle.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>OWNER</th><th>MODEL</th><th>ADDRESS</th>
			</tr>
		</thead>
		<tbody>
		<% CarVO vo = (CarVO)request.getAttribute("car"); %>
			<tr>
				<td><%= vo.getId() %></td>
				<td><%= vo.getOwner() %></td>
				<td><%= vo.getModel() %></td>
				<td><%= vo.getAddress() %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>