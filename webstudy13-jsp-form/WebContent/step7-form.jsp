<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step7-form</title>
</head>
<body>
<%-- 학생 이름 입력하고 점수 입력하면
	 ( 100 ~ 90 = A
	   	89 ~ 80 = B
	   	79 ~ 70 = C
	   	70 ~  0 = F )
	  ... 님은 ... 학접입니다.
	  F학점일 경우 step7-F.jsp로 이동한다.
	   	
 --%>
<form action = "step7-grade.jsp">
이름 <input type = "text" name = "studentName" required = "required">
점수 <input type = "number" name = "studentScore" min = "0" max = "100">
<input type = "submit" value = "학점조회">
</form>
</body>
</html>