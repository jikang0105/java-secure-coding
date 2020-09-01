<%@page import="org.kosta.model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
상품조회결과 <br>
<% ProductVO vo = (ProductVO)request.getAttribute("productInfo"); %>
아이디 : <%= vo.getId() %><br>
상품명 : <%= vo.getName() %><br>
제조사 : <%= vo.getMaker() %> <br>
가격 : <%= vo.getPrice() %><br>
</body>
</html>