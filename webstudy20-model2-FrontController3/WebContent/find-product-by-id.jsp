<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="front">
		<input type = "hidden" name = "command" value = "findProductById">
		상품아이디 <input type = "text" name = "productId"><br>
		<input type = "submit" value = "검색">
	</form>

</body>
</html>