<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차량 검색</title>
</head>
<body>
<%-- controller.SelectCarByIdServlet
	 MockDAO의 selectCarById()와 연동해서
	 차량정보가 존재하면 selectcar-ok.jsp에서 차량정보를 아이디, 차주명, 모델명, 주소를 제공한다. 
	 차량정보가 존재하지 않으면 selectcar-fail.jsp에서 차량정보가 존재하지 않습니다. alert()
	 location.href로 selectcar-form.jsp로 이동시킨다.
 --%>
<form action = "front">
<input type="hidden" name = "command" value ="selectCar">
아이디 <input type = "text" name = "carId">
<input type = "submit" value = "차량정보검색">

</form>

</body>
</html>