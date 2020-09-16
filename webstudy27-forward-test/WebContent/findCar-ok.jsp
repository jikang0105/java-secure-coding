<%@page import="org.kosta.model.CarDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findcar-ok</title>
</head>
<body>
<% CarDTO cdto = (CarDTO)request.getAttribute("cdto"); %>
차량 번호 : <%= cdto.getCarNo() %><br>
모델명 : <%= cdto.getModel() %><br>
가격 : <%= cdto.getPrice() %><br>
</body>
</html>