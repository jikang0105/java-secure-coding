<%@page import="model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	PersonVO vo = new PersonVO("손흥민", 35);
	request.setAttribute("pvo", vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl 다중조건(choose, when, otherwise)</title>
</head>
<body>
	EL로 name과 age를 출력  		이름 : ${requestScope.pvo.name }		나이 : ${requstScope.pvo.age } 세
	<hr>
	jstl 다중조건 choose, when, otherwise<br>
	<%--
		아래코드는
		if(){
		}else if(){
		}else{
		}
	
	 --%>
	<c:choose>
		<c:when test="${requestScope.pvo.name=='강소라' }">
			이름은 강소라이며 나이는 ${requestScope.pvo.age } 세
		</c:when>
		<c:when test="${requestScope.pvo.name=='손흥민' }">
			이름은 손흥민 나이는 ${requestScope.pvo.age } 세
		</c:when>
		<c:otherwise>
			<%-- else 역할 --%>
			강소라 아님
		</c:otherwise>
	</c:choose>
</body>
</html>