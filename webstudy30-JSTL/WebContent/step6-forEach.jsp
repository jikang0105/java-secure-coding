<%@page import="model.CarVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach begin="1" end="5" var="num">
${num}
</c:forEach>
<hr>
<%
		PersonVO pa[]={new PersonVO("서예지", 32), new PersonVO("김수현", 31),
				new PersonVO("박나래",35)};
		request.setAttribute("parray", pa);
		
%>
<%--
			items : 배열 또는 컬렉션, var : 요소를 담을 변수, varStatus : count, index(0부터)
 --%>
<c:forEach items="${requestScope.parray}" var="person" varStatus="order">
${order.count}. 이름 : ${person.name}  나이 : ${person.age} <br>
</c:forEach>
<%
		ArrayList<CarVO> list = new ArrayList<CarVO>();
		list.add(new CarVO("123","모닝", 1000));
		list.add(new CarVO("234","테슬라",4500));
		list.add(new CarVO("789","소나타",2500));
		session.setAttribute("carList", list);
%>
<hr>
<%--
			1. 	모델명 :		가격 :
			...
			3. 모델명 : 		가격 :
 --%>
 <c:forEach items="${sessionScope.carList }" var="car" varStatus="order">
 ${order.count}. 모델명 : ${car.model}       가격 : ${car.price} <br>
 </c:forEach>
</body>
</html>