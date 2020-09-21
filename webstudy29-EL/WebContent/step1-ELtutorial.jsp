<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.kosta.model.CarVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL연습</title>
</head>
<body>
<%
	// 컨트롤러에서 공유했다고 가정
	CarVO car1 = new CarVO("1234", "소나타", 2000);
	request.setAttribute("cvo", car1);
%>
	<h3>EL(Expression Language) 기본</h3>
	1. 기존 방식으로 출력한다 (스크립틀릿)
	<% CarVO c = (CarVO)request.getAttribute("cvo"); %>
	<%= c.getModel() %><br><br>
	2. EL방식으로 출력한다.
	${requestScope.cvo.model} ${cvo.model} <br><br>
<%
	ArrayList<CarVO> list=new ArrayList<CarVO>();
	list.add(new CarVO("234", "테슬라", 4500));
	session.setAttribute("carList", list);
	// 위 코드는 컨트롤러에서 할당했다고 가정한다.
%>
	3. 기존방식으로 세션 영역의 ArrayList의 요소에 접근한다.
<%
	@SuppressWarnings("unchecked")
	ArrayList<CarVO> rList=(ArrayList<CarVO>)session.getAttribute("carList");
	CarVO c1= rList.get(0);
%>
	<%= c1.getModel() %>
	<br><br>
	4. EL방식으로 세션영역의 ArrayList의 요소에 접근한다.
	${sessionScope.carList[0].model }
	<br><br>
	<%
		HashMap<String, CarVO> map= new HashMap<String, CarVO>();
		map.put("car1", new CarVO("333", "모닝", 1000));
		session.setAttribute("carMap", map);
		// 컨트롤러에서 할당했다고 가정한다.
	%>
	5. 기존 방식으로 세션 영역의 HashMap의 요소에 접근한다.
	<% @SuppressWarnings("unchecked")
		HashMap<String, CarVO> rMap=(HashMap<String, CarVO>)session.getAttribute("carMap");
		CarVO vo = rMap.get("car1");
	%>
	<%= vo.getModel() %>
	6. EL 방식으로 세션영역의 HashMap요소에 접근한다.
	${sessionScope.carMap.car1.model}
</body>
</html>