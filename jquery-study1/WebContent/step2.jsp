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
	// document가 준비된 시점(메모리에 로딩)에 익명함수가 실행되고
	// 이 익명함수는 현페이지에서 필요한 이벤트 행위를 일괄적으로 등록한다.
	$(document).ready(function(){
		//alert(1);
		// :button -> jquery 필터로 선택, type=button을 선택해준다.
		$(":button").click(function(){
			alert($(this).val()+"클릭되었습니다.");
		});
	});
</script>
</head>
<body>
	<div class="container">
		<input type="button" value="버튼1"><br>
		<input type="button" value="버튼2"><br>
		<input type="button" value="버튼3"><br>
	</div>
</body>
</html>