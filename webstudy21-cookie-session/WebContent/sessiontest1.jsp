<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session test1</title>
</head>
<body>
<%-- 
		jsp는 웹 컨테이너에 의해.java 확장자의 class로 생성되고
		이 떄 jspService() 메서드 내부에서 자동으로 getSession() 메서드가 실행된다.
		즉, 세션이 있으면 기존 세션을 반환하고 세션이 없으면 새로 생성하게 된다.
 --%>
세션 테스트1 <%= session.getId() %>
</body>
</html>