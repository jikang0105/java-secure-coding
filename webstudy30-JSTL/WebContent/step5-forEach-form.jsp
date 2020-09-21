<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "step5-forEach-action.jsp" method="post">
주문자 <input type="text" name="customerName"><br>
<input type="checkbox" name="menu" value="전어">전어<br>
<input type="checkbox" name="menu" value="소주">소주<br>
<input type="checkbox" name="menu" value="맥주">맥주<br>
<input type="submit" value="주문">
</form>
<%--
			주문자명 : ----
			주문항목
			1. 전어
			2. 맥주
 --%>
</body>
</html>