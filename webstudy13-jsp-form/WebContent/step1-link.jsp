<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>link test</title>
</head>
<body>
<%--
	 query string 방식 : 서버url?name=value&name=vlaue
	  위와 같이 전송하면 Servlet과 jsp에서 
	 request.getParameter(name)으로 반환받으면 된다.
--%>
<a href = "step1-link-action.jsp?command=find&no=1">첫번째 링크</a><br>
<a href = "step1-link-action.jsp?command=update&no=2">두번째 링크</a><br>
</body>
</html>