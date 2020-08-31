<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차량정보삭제</title>
</head>
<body>
<%-- 
	HandlerMapping에서 else if추가
	DeleteCarController를 정의한다
	delete-car-result.jsp로 리 다이렉트한다.
 --%>
<form action = "front">
<input type = "hidden" name = "command" value = "deleteCar">
아이디 <input type="number" name = "id">
<input type = "submit" value = "삭제">
</form>
</body>
</html>