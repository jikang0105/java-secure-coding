<%@ page import = "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp ArrayList test</title>
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
<%  ArrayList<String> list = new ArrayList<String>();
	list.add("감자튀김");
	list.add("노가리");
	list.add("골뱅이");
%>
<table>
	<tr>
		<td>순번</td><td>메뉴</td>
	</tr>
	<%-- tr 부분을 전체적으로 for loop 화면에 표현한다. --%>
	<%
		for(int i = 0; i < list.size(); i++){
	%>
	<tr>
		<td><%= (i + 1) %></td><td><%= list.get(i) %></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>