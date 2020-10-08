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
<title>jquery on</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("#createBtn").click(function(){
			// 최초화면 로딩시에는 존재하지않는 testBtn class 버튼이 동적으로 생성된다.
			var btn="<input type='button' value='버튼' class='testBtn'><br>";
			$("#testDiv").append(btn);
		})
		// 최초 로딩시에는 .testBtn 버튼이 존재하지 않으므로 아래 이벤트는 동작되지 않는다.
		/* $(".testBtn").click(function(){
			alert("클릭했군요!");
		}) */
		// 동적으로 생성되는 요소에 대한 이벤트 등록은 jquery의 on함수를 이용해서 한다.
		// 셀렉트 대상의 부모요소 .on(이벤트타입, 대상요소, 동작할 익명함수);
		$("#testDiv").on("click", ".testBtn", function(){
			alert($(this).val()+" 클릭");
		});
	});
</script>
</head>
<body>
	<div class="container">
	<%-- 아래 버튼을 누르면 testDiv 영역에 동적으로 버튼을 생성한다. --%>
		<input type="button" value="버튼생성" id="createBtn">
		<hr>
		<div id="testDiv"></div>
	</div>
</body>
</html>