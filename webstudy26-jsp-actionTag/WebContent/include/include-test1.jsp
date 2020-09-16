<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include-test1</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr>
<h2>메인화면1</h2><br><br>
<a href="include-test2.jsp">화면2로 이동</a>
<br><br><br><br><br>
<hr>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>