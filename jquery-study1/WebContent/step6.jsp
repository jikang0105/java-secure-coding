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
<title>jquery 셀렉터 대상이 여러개일경우</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#testBtn").click(function(){
			alert($(this).val());
		});
		// 셀렉터,셀렉터,셀렉터
		$(".student,.teacher").click(function(){
			$("#result").text($(this).text());
		})
	});
</script>
</head>
<body>
	<div class="container">
		<%-- jquery를 이용해서 id가 testBtn일 경울 클릭하면 자신의 value를 alert으로 출력한다. --%>
		<input type="button" value="셀렉터 연습" id="testBtn">
		<br><br>
		<div class="student">아이유</div>
		<div class="teacher">정우성</div>
		<div class="student">유아인</div>
		<hr>
		<div id="result"></div>
		<%-- class student를 클릭하면 result id영역에 자신의 text가 출력된다. --%>
	</div>
</body>
</html>