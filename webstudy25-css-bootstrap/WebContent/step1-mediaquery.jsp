<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 반응형 웹을 위한 미디어쿼리 선언부 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>반응형 웹 미디어쿼리 테스트</title>
<style type = "text/css">
	body{
		background-color: lightgray;
	}
	/*	
		부트스트랩 프레임워크 sm( 768이상 ), md( 992이상 ), lg( 1200이상 )
		768너비부터 gray
	*/
	@media (min-width : 768px ){
		body{
			background-color: darkgray;
		}
	}
	@media (min-width : 992px ){
		body{
			background-color: gray;
		}
	}
	@media (min-width : 1200px ){
		body{
			background-color: black;
		}
	}
</style>
</head>
<body>

</body>
</html>