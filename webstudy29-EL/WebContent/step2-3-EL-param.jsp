<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step2-3-EL-param.jsp</title>
</head>
<body>
1. 기존 방식 파라미터 처리 : 
<%= request.getParameter("nick") %>, 
<%-- 기존 방식에서는 문자열로 인식되므로 문자열 1이 뒤에 추가된다. --%>
<%= request.getParameter("age") +1 %>
<hr>
2. EL 방식 파라미터 처리 : 
<%-- EL 방식은 내부적으로 형 변환하여( Integer.parseInt() ) 연산되므로 +1이 된다. --%>
${param.nick }, ${param.age+1 }
<hr>
<form action="step2-4-EL-paramValues.jsp">
	<input type="checkbox" name="food" value="삼겹살">삼겹살<br>
	<input type="checkbox" name="food" value="참이슬">참이슬<br>
	<input type="submit" value="전송">
</form>
</body>
</html>







