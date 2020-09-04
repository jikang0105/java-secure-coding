<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="front?command=productList">상품목록</a>
<hr>
<h3>상품등록</h3>
<form action="front" method="post">
<input type="hidden" name="command" value="registerProduct">
상품명 <input type="text" name="name" required="required"><br>
제조사 <input type="text" name="maker" required="required"><br>
가격 <input type="number" name="price" required="required"><br>
<input type="submit" value="등록하기">
</form>
<%--	register-form.jsp  -- command:register --> RegisterProductController <--> ProductDAO
																				  register(ProdluctVO)
				|
				| redirect
	   register-result.jsp																   
--%>	   
</div>
</body>
</html>