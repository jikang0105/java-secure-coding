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
<title>jquery select</title>
<script type="text/javascript">
$(document).ready(function() {
	$("#createOption").click(function(){
		//alert(1);
		var arr=["손흥민", "이강인", "황의조"];
		for(var i=0; i<arr.length; i++){
			$("#friend").append("<option value="+arr[i]+">"+arr[i]+"</option>");
		}
	})
	$("#deleteOption").click(function() {
		$("#friend").empty(); // 대상의 자식 요소를 삭제한다. 즉, 옵션을 삭제한다.
	})
})
</script>
</head>
<body>
	<div class="container">
		<input type="button" value="셀렉트옵션생성" id="createOption"> 
		<input type="button" value="셀렉트옵션삭제" id="deleteOption"> 
		<select id="friend"></select>
	</div>
</body>
</html>