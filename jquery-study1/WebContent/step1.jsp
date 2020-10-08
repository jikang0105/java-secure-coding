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
	// jQuery의 ready함수는 document가 준비되는 시점에 실행된다.
		/*	jQuery(document).ready(function(){
			alert("jquery"+documnet.getElementById("ts");
		}); */
		// jQuery와 $는 같은표현이다 : 자바스크립트 객체를 jQuery 객체로 변환한다.
		$(document).ready(function(){
			//alert("jquery"+document.getElementById("ts"));
			//ready 시점에 현 페이지의 이벤트를 등록한다.
			// a tag에 대해 클릭했을 때 자신의 text를 alert으로 출력하는 이벤트를 등록한다.
			$("a").click(function(){
				alert($(this).text());
			})
		});
	</script>
</head>
<body>
	<div class="container">
		jQuery Basic <span id="ts">test span</span>
		<ul>
			<li><a href="#">test1</a></li>
			<li><a href="#">test2</a></li>
			<li><a href="#">test3</a></li>
		</ul>
		<!-- <script type="text/javascript">
			alert(document.getElementById("ts"));
		</script> -->
	</div>
</body>
</html>