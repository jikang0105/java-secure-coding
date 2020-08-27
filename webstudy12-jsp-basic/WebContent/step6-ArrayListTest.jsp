<%@page import="model.Person"%>
<%@page import="java.util.ArrayList"%>
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
	table,td, th{
		border: 1px solid black;
	}
	td, th{
		padding: 10px;
	}

</style>
</head>
<body>
<%
	ArrayList<Person> list = new ArrayList<Person>();
	list.add(new Person("김재호", 30));
	list.add(new Person("오재원", 31));
	list.add(new Person("오재일", 30));
%>
<table>
	<thead>
	 	<tr>
	 		<th>순번</th><th>이름</th><th>나이</th>
	 	</tr>
	 </thead>
	 <tbody>
	 	<%-- for loop tr td --%>
	 	<% for(int i = 0; i < list.size(); i++){ %>
	 	<tr>
	 		<th><%= i + 1 %></th><th><%= list.get(i).getName() %></th><th><%= list.get(i).getAge() %></th>
	 	</tr>
	 	<%
	 	}
	 	%>	
	 </tbody>
</table>
</body>
</html>