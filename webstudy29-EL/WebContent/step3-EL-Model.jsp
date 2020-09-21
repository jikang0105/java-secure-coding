<%@page import="org.kosta.model.TestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL에서 Model에 접근</title>
</head>
<body>
<%
	TestVO vo = new TestVO();
	request.setAttribute("tvo", vo);
%>
<%--
		EL에서 Model에 접근 가능한 메서드는 get계열과 is계열 메서드만 가능하다.
		is 계열 메서드는 리턴타입이 boolean일때 사용한다.
 --%>
1. TestVO의 name을 출력한다 : ${requestScope.tvo.name}
<%-- ${requestScope.tvo.nick } --%>
<br>
2. TestVO의 message를 출력한다 : ${requestScope.tvo.message }
<br>
3. TestVO의 exist를 출력한다 : ${requestScope.tvo.exist }
${requestScope.tvo.exist == false }
<br>
4. TestVO의 money를 출력한다 <br>
${requestScope.tvo.money }<br>
${requestScope.tvo.money * 4 }<br>
${requestScope.tvo.money > 100 }<br>
${requestScope.tvo.money > 100 && requestScope.tvo.money < 200 } <br>
<hr>
${sessionScope.mvo==null } ${sessionScope.mvo != null }
</body>
</html>