<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl import(jsp include action tag와 역할이 같다)</title>
</head>
<body>
<%-- 
			jstl import는 jsp include와 역할이 같다.
			차이는 jstl import는 다른 웹어플리케이션의 자원을 이용할 수 있다.
 --%>
<c:import url="header.jsp"></c:import>
이 부분은 step11 화면입니다.<br><br><br><br>
<%--
		jstl import를 이용해 다른 웹 어플리케이션의 자원을 가져와본다.
		jsp:include는 자신의 웹어플리케이션 내의 자원만 가져올 수 있다.
--%>
<c:import url="http://localhost:8888/webstudy29-EL/footer.jsp"></c:import>
</body>
</html>