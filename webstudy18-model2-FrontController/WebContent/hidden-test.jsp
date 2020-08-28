<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>html hidden test</title>
</head>
<body>
	<form action="hidden-result.jsp">
		<input type = "hidden" name = "commend" value = "register">
		<input type = "submit" value = "test">
	</form>
	<hr>
	<a href = "hidden-result.jsp?command=selectCar">link test</a>
</body>
</html>