<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp forward actiontag 연습</title>
</head>
<body>
<%--
			forward-form.jsp -- forward-action.jsp
										김희철님 35세 성인입니다.
										만약 19세 미만이면 jsp forward action tag를 이용해
										child-view.jsp에서 응답하게 한다.
 --%>
<form action="forward-action.jsp">
이름 <input type="text" name="userName"><br>
나이 <input type="number" name="userAge"><br>
<input type="submit" value="입장하기">
</form>
</body>
</html>