<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- step6-action.jsp에서는
		 19세를 초과할 때 -> 김재호님 즐거운 영화 관람되세요.
		 19세 이하일 때 -> 본 영화는 성인영화로 19세 이하는 관람하실 수 없습니다. --%>
	<form action = "step6-action.jsp">
		이름  <input type = "text" name = "userName">
		나이  <input type = "number" name = "userAge" min = "1" max = "150">
		<input type = "submit" value = "관람하기">
	</form>
</body>
</html>