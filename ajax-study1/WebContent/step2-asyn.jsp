<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비동기적 방식 통신(ajax)의 예</title>
<script type="text/javascript">
	function startAjax(){
		// ajax 통신을 위한 자바스크립트 객체
		xhr = new XMLHttpRequest();
		//alert(xhr);
		// callback 함수를 등록,
		// callback함수는 readystate가 변화될 때 호출(서버가 응답할 때 호출된다.)
		xhr.onreadystatechange=callback;
		// open(method, ServerUrl) : 요청메서드방식과 처리할 서버 프로그램 url
		xhr.open("GET", "AsynServlet");
		xhr.send(null);//post 방식일때 사용한다.
	}
	function callback(){
		// readyState가 4(서버로부터 응답데이터를 받은 상태)
		// status 200 (정상수행)
		if(xhr.readyState==4 && xhr.status==200){
			// responseText : 서버가 응답한 데이터
			// alert(xhr.responseText);
			// span에 접근해서 서버가 응답한 데이터를 할당해본다.
			document.getElementById("result").innerHTML=xhr.responseText;
		}
	}
</script>
</head>
<body>
<form>
<input type="text" name="userInfo">
<input type="button" value="비동기통신(ajax)테스트" onclick="startAjax()">
<span id="result"></span>
</form>
<hr>
<textarea rows="100" cols="100"></textarea>
</body>
</html>