<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinform</title>
</head>
<body>
<form action="first">
<input type="hidden" name="command" value="checkid">
아이디 : <input type="text" name="userid"> <input type="submit" value="중복확인">
</form>
<form method="post" action="first">
<input type="hidden" name="command" value="joinmember">
<%
	Cookie[] cookies = request.getCookies();
	if(cookies[1] != null){
%>
<input type="hidden" name="id" value="<%= cookies[1].getValue %>">
패스워드 : <input type="text" name="password"><br>
이름 : <input type="text"		
	}
%>
<input type
</form>
</body>
</html>