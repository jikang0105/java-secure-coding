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
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		// .ct는 class ct인 대상을 선책한다.
		$(".ct").click(function(){
			//alert("클릭");
			return confirm($(this).text()+"로 이동하시겠습니까?");
		});
	})
</script>
</head>
<body>
	<div class="container">
		<a href="http://daum.net" class="ct">DAUM</a><br>
		<a href="http://namer.com">NAVER</a><br>
		<a href="http://google.com" class="ct">GOOGLE</a><br>
	</div>
</body>
</html>