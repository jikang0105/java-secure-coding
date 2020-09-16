<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*, org.kosta.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbcp test</title>
</head>
<body>
1. 커넥션을 생성, 소멸하는 기존방식의 커넥션
<%
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	Connection con = DriverManager.getConnection(url, "scott", "tiger"); // 커넥션을 생성한다.
%>
<%= con.getClass() %>
<% con.close(); // 커넥션을 소멸시킨다. %>
<br><br>
2. 커넥션을 커넥션풀에 미리 생성하고 반납하는 커넥션
<%
	DataSource dataSource = DataSourceManager.getInstance().getDataSource();
	Connection dbcpCon = dataSource.getConnection(); // 커넥션을 dbcp로부터 빌려온다.
%>
<%= dbcpCon.getClass() %>
<% dbcpCon.close(); // 커넥션을 반납한다. %>
</body>
</html>