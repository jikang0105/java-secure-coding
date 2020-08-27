<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect방식 테스트</title>
</head>
<body>
<%--								Controller	
	insert_from.jsp -- request -- InsertServlet <--> Model
										|
										| redirect 방식 이동
									  View
				<-- response -- insert_result.jsp
 --%>
<form method = "post" action = "InsertServlet">
고객정보 <input type = "text" name = "customerInfo">
<input type = "submit" value = "등록(redirectTest)">
</form>
</body>
</html>