<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp text</title>
<style type="text/css">
	table {
		border-collapse : collapse;
	}
	table,td{
		border: 1px solid black;
	}
	td{
		padding: 10px;
	}

</style>
</head>
<body>
	<% Person p = new Person("박건우", 30); %>
	<table>
		<tr>
			<td>이름</td><td><%= p.getName() %></td>
		</tr>
		<tr>
			<td>나이</td><td><%= p.getAge() %></td>
		</tr>
	</table>
</body>
</html>