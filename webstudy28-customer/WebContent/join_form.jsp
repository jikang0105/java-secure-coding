<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>join_form</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
	.content{
		height: 400px;
	}
	footer{
		background-color: black;
		color: white;
		padding: 15px;
	}
	</style>
	<script type="text/javascript">
		function checkForm(){
			var f = document.joinForm;
			if(f.userPass.value !== f.repeatUserPass.value){
				alert("비밀번호가 일치하지 않습니다.");
				return false;
			}
			if(f.userId.value !== f.saveCheckId.value){
				alert("인증받은 아이디가 아닙니다./n아이디를 중복확인해주세요.");
				return false;
			}
		}
		function checkId(){
			var id = document.joinForm.userId.value;
			if(id === ""){
				alert("아이디를 입력하세요.");
			} else {
				var path = "front?command=checkId&userId="+id;
				window.open(path,"mypopup", "width=200,height=200,top=150,left=200");
			}
		}
	</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="content">
	<form action="front" method="post" name="joinForm" onsubmit="return checkForm()">
		<input type="hidden" name="command" value="join">
		아이디 : <input type="text" name="userId" required="required">
		<input type="button" value="중복확인" onclick="checkId()"><br>
		<input type="hidden" name="saveCheckId" value="">
		비밀번호 : <input type="password" name="userPass" required="required"><br>
		비밀번호확인 : <input type="password" name="repeatUserPass" required="required"><br>
		이름 : <input type="text" name="userName" required="required"><br>
		주소 : <input type="text" name="address" required="required"><br>
		생일 : <input type="date" name="birth" required="required"><br>
		<input type="submit" value="가입하기" required="required"><br>
	</form>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>