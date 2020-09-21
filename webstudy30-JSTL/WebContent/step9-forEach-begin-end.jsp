<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstl forEach begin end</title>
</head>
<body>
	<c:forEach begin="1" end="10" var="page">
		${page} &nbsp;&nbsp;
	</c:forEach>
	<hr>
	<%
			request.setAttribute("startPage", 11);
			request.setAttribute("endPage", 15);
			// startPage와 endPage를 이용해 forEach 구문을 실행해본다.
			request.setAttribute("nowPage", 14);
			// nowPage에는 링크(a href)가 부여되지 않고
			// 나머지 페이지 번호에는 링크가 부여되도록 한다.
	%>
	<c:forEach begin="${requestScope.startPage}" end="${requestScope.endPage}" var="page">
		<c:choose>
			<c:when test="${requestScope.nowPage == page }">${page}</c:when>
			<c:otherwise>
				<a href="#">${page}</a>
			</c:otherwise>
		</c:choose>
		&nbsp;&nbsp;
	</c:forEach>
</body>
</html>