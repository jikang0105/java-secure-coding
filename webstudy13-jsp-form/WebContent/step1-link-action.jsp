<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과페이지</title>
</head>
<body bgcolor="yellow">
결과 페이지 입니다.
command : <%= request.getParameter("command") %><br>
no : <%= request.getParameter("no") %>
</body>
</html>