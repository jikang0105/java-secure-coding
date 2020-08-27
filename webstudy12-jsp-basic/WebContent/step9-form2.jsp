<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp form연동</title>
</head>
<body>
	<form action="step9-action.jsp" method = post">
		이름 <input type="text" name="userName" required="required"><br>
		주소<input type="text" name="userAddr" required="required"><br>
		<input type="submit" value = "등록">
	</form>
</body>
</html>