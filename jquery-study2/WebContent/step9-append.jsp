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
<title>step9-append.jsp</title>
<style type="text/css">
	#span1{
		background-color: yellow;
	}
	#span2{
		background-color: lime;
	}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$("#testBtn").click(function(){
			$("#span1").append("가수"); // 대상요소의 마지막 하위(자식) 요소로 추가한다.
			$("#span2").after("가수"); // 대상요소의 형제 요소로 마지막에 추가한다.
			$("a[href*=daum]").append("go");
			$("a[href*=google]").after("go");
		})
		
	})
</script>
</head>
<body>
<input type="button" id="testBtn" value="테스트"><br><br>
<span id="span1">아이유</span><hr>
<span id="span2">이효리</span><hr>
<a href="http://daum.net">다음넷으로</a><hr>
<a href="http://google.com">구글로</a><hr>
</body>
</html>









