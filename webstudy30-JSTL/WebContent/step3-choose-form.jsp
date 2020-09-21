<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step3-choose-form.jsp</title>
</head>
<body>
<form action="step3-choose-action.jsp">
이름 <input type="text" name="userName"><br>
나이 <input type="number" name="userAge"><br>
<input type="submit" value="전송">
</form>
<%--
		step3-choose-action.jsp
		19세 이상이면
		아이유님 28세 성인입니다
		13세 이상이면
		아이유님 15세 청소년입니다.
		1~13세 미만이면
		아이유님 7세 어린이 입니다.
		0세 이하이면
		아이유님 사람이 아닙니다.
 --%>
</body>
</html>