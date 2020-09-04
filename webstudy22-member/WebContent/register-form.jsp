<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입폼</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<script type="text/javascript">
	function checkForm(){
		var f=document.registerForm;		
		if(f.password.value!==f.repeatPassword.value){
			alert("비밀번호와 비밀번호 확인이 일치하지 않습니다!");
			return false;
		}		
		// flag.value는 인증받은 아이디(idcheck-ok.jsp 팝업에서 할당) , 
		// id.value는 사용자가 입력한 아이디를 비교 
		if(f.flag.value!==f.id.value){
			alert("인증받은 아이디가 아닙니다\n아이디 중복확인을 하세요");
			return false;
		}
	}
	function checkId(){
		var id=document.registerForm.id.value;
		if(id===""){
			alert("아이디를 입력하세요!");
		}else{
			var path="front?command=idcheck&id="+id;
			window.open(path,"mypopup",
					"width=200,height=200,top=150,left=200");
		}
	}
</script>
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<form action="front" method="post" name="registerForm" onsubmit="return checkForm()">
<input type="hidden" name="command" value="register">
<%-- id 중복확인을 위한 hidden --%>
<input type="hidden" name="flag" value="">
아이디 <input type="text" name="id" required="required">
<input type="button" value="중복확인" onclick="checkId()"><br>
패스워드 <input type="password" name="password" required="required"><br>
패스워드확인 <input type="password" name="repeatPassword" required="required"><br>
이름 <input type="text" name="name" required="required"><br>
주소 <input type="text" name="address" required="required"><br>
<input type="submit" value="회원가입">
</form>
</div>
</body>
</html>














