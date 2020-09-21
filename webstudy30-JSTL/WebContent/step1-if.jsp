<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- JSTL 선언부 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL if</title>
</head>
<body>
<c:if test="true">
	true이므로 실행한다
</c:if>
<c:if test="false">
	false이므로 실행안됨
</c:if>
<hr>
<a href="step1-if.jsp?age=30&nick=돼지">step1을 다시 호출한다.</a><br><br>
나이 ${param.age } 닉네임 ${param.nick }
<br>
<c:if test="${param.age>20 && param.nick == '돼지'}">
나이가 20세를 초과함, 닉네임은 돼지임.
</c:if>
</body>
</html>