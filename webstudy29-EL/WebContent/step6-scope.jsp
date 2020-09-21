<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 내장객체 scope(범위) 접근관련</title>
</head>
<body>
<%-- jsp 내장객체 범위
		request < session < application(ServletContext)
		request의 유효범위 = response 할때까지
		session = 로그아웃(서버에서 session.invalidate()) or 클라이언트 브라우저종료
						or 지정한 session timeout까지 재 접속이 없을 경우
		application(ServletContext) = 웹어플리케이션 서비스 종료때까지 유효
--%>
<%
		request.setAttribute("info", "request정보임");
		session.setAttribute("info", "session정보임");
		application.setAttribute("info", "application정보임"); // ServletContext에 set한 것
%>
${requestScope.info }<br>
${sessionScope.info}<br>
${applicationScope.info}<br>
<%-- ...Scope를 생략하고 선언할 경우 가장 범위가 좁은 request의 info가 출력된다. --%>
${info}
</body>
</html>