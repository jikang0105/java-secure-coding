<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
		.container{
			padding-top: 30px;
		}
	</style>
</head>
<body>
	<div class="container">
		<h3>회원 주소 목록</h3><br>
		<form action="">
			<select>
				<option>주소</option>
				<c:forEach items="${requestScope.list }" var="list" varStatus="order">
				<option value="${list}">${list}</option>
				</c:forEach>
			</select>
		</form>
		
	</div>
</body>
</html>