<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include-test2</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr>
<h2>화면2</h2><br><br>
<a href="include-test1.jsp">메인화면으로 이동</a>
<br><br><br><br><br>
<hr>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>