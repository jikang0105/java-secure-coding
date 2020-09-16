<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
		.content{
			height: 400px;
		}
		footer{
			background-color: yellow;
			color: black;
			padding: 15px;
		}
	</style>
	<title>main1</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="content">
		메인2화면입니다.
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>