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
	<title>jquery basic</title>
	<script type="text/javascript">
		$(document).ready(function(){
			// id가 btn2일 대상을 선택해서 이벤트 등록한다.
			$("#btn2").click(function(){
				alert($(this).val());
			})
			// id가 btn3인 대산을 선택해서 이벤트를 등록한다
			// 자신의 value를 span id resultView에 출력한다 (text(값))
			$("#btn3").click(function(){
				//alert($(this).val());
				//$(resultView).text($(this).val());
				// innerHTML 형식으로 html tag를 적용할 때는 html() 함수를 사용한다.
				$(resultView).html("<font color=blue>"+$(this).val()+"</font>");
			})
		});
	</script>
</head>
<body>
	<div class="container">
		<input type="button" value="테스트1 이벤트 적용 안됨"><br><br>
		<input type="button" value="테스트2 값을 출력" id="btn2"><br><br>
		<input type="button" value="테스트3 값을 span에 출력" id="btn3">
		<span id="resultView">span영역</span><br><br>
	</div>
</body>
</html>