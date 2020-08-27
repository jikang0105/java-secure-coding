<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과화면</title>
</head>
<body>
당신의 아이디는 <%= request.getParameter("userId") %>  입니다.<br><br>
<a href="step8-form.jsp">입력폼으로</a>
</body>
</html>