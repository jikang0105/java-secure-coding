<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinform</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<script type="text/javascript">
	function checkPass(){
		var pass = document.registerForm;
		if(pass.password.value!==pass.checkpass.value){
			alert("패스워드가 동일하지 않습니다.");
			return false;
		}
		// flag.value는 인증받은 아이디(idcheck-ok.jsp 팝업에서 할당)
		// id.value
		if(pass.flag.value!==pass.id.value){
			alert("인증받은 아이디가 아닙니다.\n아이디 중복확인을 하세요.");
			return false;
		}
	}
	
	function checkIdPopup(){
		var id=document.registerForm.id.value;
		//alert(id);
		if(id===""){
			alert("아이디를 입력하세요.");
		} else {
			var path="front?command=checkid&id="+id;
			window.open(path, "mypopup", "width=200, height=200, top=150, left=200");
		}
	}	
</script>
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<form method="post" action="front" name="registerForm" onsubmit="return checkPass()">
<input type="hidden" name="command" value="joinmember">
<%-- 아이디 중복확인을 위한 hidden --%>
<input type="hidden" name="flag" value="">
아이디 : <input type="text" name="id" required="required"> <input type="button" value="중복확인" onclick="checkIdPopup()"><br>
패스워드 : <input type="text" name="password" required="required"><br>
패스워드확인 : <input type="text" name="checkpass" required="required"><br>
이름 : <input type="text"	name="name" required="required"><br>
주소 : <input type="text" name="address" required="required"><br>
<input type="submit" value="가입"><br>
</form>
</div>
</body>
</html>