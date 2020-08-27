<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward test 응답화면</title>
</head>
<body bgcolor = "lightgray">
<a href = "index.jsp">home</a><br>
<hr>
Model2 forward 응답화면입니다.<br>
<% String result = (String)request.getAttribute("result"); %>
결과 : <%= result %>

</body>
</html>