<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "front" method = "post">
		<input type = "hidden" name = "command" value = "insertproduct">
		제품명 : <input type = "text" name = "productName"><br>
		제조사 : <input type = "text" name = "productMaker"><br>
		가격 : <input type = "text" name = "productPrice"><br>
		<input type = "submit" value = "등록">
	</form>
</body>
</html>