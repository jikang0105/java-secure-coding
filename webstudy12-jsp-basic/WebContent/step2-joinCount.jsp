<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 인스턴스 변수 선언 --%>
<%! int count; %>
<%-- <%= %> : out.print(++count) 와 동일하다. --%>
<h3>접속수 : <%= ++count %> </h3>
</body>
</html>