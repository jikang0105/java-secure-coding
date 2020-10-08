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
	<title>jquery css 선택자</title>
	<style type="text/css">
		.a{
			background-color: yellow;
		}
		.b{
			background-color: lime;
		}
	</style>
	<script type="text/javascript">
		$(document).ready(function(){
			// food class 이하의 li 태그들을 대상으로 이벤트를 적용한다
			$(".food li").click(function(){
				alert($(this).text());
			})
		});
	</script>
</head>
<body>
	<div class="container">
		<ol class="a food">
			<li>곱창</li>
			<li>전어</li>
			<li>갈비</li>
		</ol>	
		<ol class="food b">
			<li>소주</li>
			<li>맥주</li>
			<li>와인</li>
		</ol>	
		<ol>
			<li>판교</li>
			<li>강남</li>
			<li>종로</li>
		</ol>	
	</div>
</body>
</html>