<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step4-ajax-post</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		var postNoComp = document.getElementById("postNo");
		if(postNoComp.value===""){
			alert("삭제할 게시물 번호를 입력하세요");
			return; // 함수 실행을 중단한다.
		}
		xhr=new XMLHttpRequest();
		//alert("ajax 요청 " + xhr)
		// 콜백함수를 등록한다 ( 요청에 대한 응답이 완료될때 실행한다)
		xhr.onreadystatechange = callback;
		xhr.open("post", "AjaxPostServlet");
		// ajax post 방식일 때 content type을 지정해야 한다.
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		var pno = postNoComp.value;
		xhr.send("pno="+ pno) //post 방식 데이터 전송
	}
	function callback(){
		if(xhr.readyState==4&&xhr.status==200){
			alert(xhr.responseText);
		}
	}
	
</script>
</head>
<body>
<input type="number" id="postNo" placeholder="포스트번호">
<input type="button" value="삭제" onclick="startAjax()">
<span id="deleteResult"></span>
</body>
</html>