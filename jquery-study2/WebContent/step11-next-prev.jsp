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
<title>jquery next(), prev()</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("#infoDiv .desc").click(function(){
			//alert($(this).text());
			//클릭된 요소의 다음 요소에 클릭된 요소의 텍스트를 할당한다.
			$(this).next().text($(this).text());
		})
		$("#deleteAllBtn").click(function() {
			// class desc 다음 요소의 정보를 지운다.
			$("#infoDiv .desc").next().text("");
		})
		$("#prevBtn").click(function(){
			alert($(this).prev().prev().prev().text());
		})
	})
</script>
</head>
<body>
	<div class="container">
		<div id="infoDiv">
			<span class="desc">뷔</span><span></span><br>
			<span class="desc">랩몬</span><span></span><br>
			<span class="desc">이날치</span><span></span><br>
			<br><br>
			<input type="button" value="추가한 데이터를 지움" id="deleteAllBtn">
			<br><br>
			<span>카카오톡</span>
			<br><font>카카오 게임즈</font>
			<button type="button" id="prevBtn">prevTest</button>
		</div>
	</div>
</body>
</html>