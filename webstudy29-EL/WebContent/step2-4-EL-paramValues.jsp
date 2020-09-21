<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step2-4-EL-paramValues.jsp</title>
</head>
<body>
<%-- EL 방식이므로 null일 경우 출력하지 않는다. --%>
메뉴 1 ${paramValues.food[0] }<br>
메뉴 2 ${paramValues.food[1] }
</body>
</html>