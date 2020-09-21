<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step2-2-EL-param.jsp</title>
</head>
<body>
<a href="step2-1-EL-param.jsp">step2-1-EL-param.jsp로 이동</a>
<hr>
1. 기존 방식으로 파라미터 전달받음
<%= request.getParameter("name") %>
<%= request.getParameter("address") %>
<br><br>
2. EL 방식으로 파라미터 전달받음
<%--
	 EL 방식을 이용하면 null일 경우 화면에 표현하지 않는다.
	 기존 방식 <%= %>은 null일 경우 null로 화면에 표현한다.
 --%>
${param.name } ${param.address }
<hr>
<form action="step2-3-EL-param.jsp">
닉네임 <input type="text" name="nick"><br>
나이 <input type="number" name="age"><br>
<input type="submit" value="전송">
</form>
</body>
</html>