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
</head>
<body>
	<div class="container">
		<h3>Model2 회원관리(EL과 JSTL적용)</h3>
		<form action="front">
			<input type="hidden" name="command" value="findMemberById">
			아이디 <input type="text" name="id" required="required">
			<input type="submit" value="검색">
		</form>
		<br><br>
		<a href="front?command=getAddressKind">주소목록조회</a>
		<br><br>
	</div>
</body>
</html>