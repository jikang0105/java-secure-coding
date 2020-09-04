<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="register-form.jsp">상품등록</a>&nbsp;&nbsp;&nbsp;
<%--
		index의 링크 -- command=productList --> ProductListController <--> ProductDAO
																		getAllProductList():ArrayList<productVO>
							   |
							   | forward
							 product-list.jsp
							 아이디, 이름, 등록일자 테이블로 출력
 --%>
<a href="front?command=productList">상품리스트</a>
<hr>

</div>
</body>
</html>