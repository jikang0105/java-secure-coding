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
	<title>jquery hide, show img</title>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#hideBtn").click(function(){
				//alert($(this).val());
				//hide(시간, 후속작업함수)
				$("#imgView").hide(300,function(){
					$("#stateInfo").html("사진 보기를 누르면 사진이 나타납니다.");
				});
			});
			// showBtn id 버튼을 클릭하면 imgView의 이미지를 보여준다.
			$("#showBtn").click(function(){
				$("#imgView").show(300, function(){
					$("#stateInfo").html("사진 감추기를 누르면 사진이 사라집니다.");
				});
			})
		});
	</script>
</head>
<body>
	<div class="container">
		<img src="actor.jpg" id="imgView">
		<input type="button" value="사진감추기" id="hideBtn">
		<input type="button" value="사진보기" id="showBtn">
		<hr>
		<span id="stateInfo">사진 감추기를 누르면 사진이 사라집니다.</span>
	</div>
</body>
</html>