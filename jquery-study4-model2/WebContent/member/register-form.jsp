<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>  

 
<style>
	.main{
		text-align: left; 
	}
</style>
<script>
	$(document).ready(function() {
		var checkId="";
		$("#memberId").keyup(function(){
			checkId="";
			var idValue=$(this).val();
			//$("#checkResult").text(idValue);
			if(idValue.length<4||idValue.length>10){
				$("#checkResult").html("아이디는 4자 이상 10자 이하만 가능").css("color", "pink");
				return;
			} 
			// 4자 이상 10자 이하이므로 ajax통신하여 아이디 사용가능 여부를 알려준다.
			$.ajax({
				type: "get",
				url: "front",
				data: "command=idcheck&id="+idValue,
				success: function(result){
					if(result=="ok"){
						$("#checkResult").html("아이디 사용가능").css("color", "blue");
						checkId=idValue;
					} else {
						$("#checkResult").html("아이디 사용불가").css("color", "red");
					}
				}
			})
		})
		// 아이디 중복 확인에서 사용가능 상태일때만 가입되도록 한다.
		$("#registerForm").submit(function(){
			if(checkId==""){
				alert("아이디 중복확인 해주세요");
				return false; // 전송을 막는다
			}
		});
	})
</script>
<div class="row">
<div class="col-sm-8 col-sm-offset-2">
<form action="${pageContext.request.contextPath}/front" method="post" id="registerForm">
<input type="hidden" name="command" value="register">
아이디 <input type="text" name="id" id="memberId" required="required">
<span id="checkResult"></span><br>
패스워드 <input type="password" name="password" required="required"><br>
이름 <input type="text" name="name" required="required"><br>
주소 <input type="text" name="address" required="required"><br>
<input type="submit" value="회원가입">
</form>
</div>
</div>
<!-- 
  keyup(handler) 
  step1
  4자이상 10자이하만 가능 
  만약 4자 미만 또는 10자 초과하는 경우 
  id checkResult에 아이디는 4자이상 10자이하만 가능! (pink)
  css("color","pink");
  
  step2 
  4자이상 10자이하인 경우 서버 전송되어 (ajax 통신)
 db에 존재하면 checkResult에 중복된 아이디 사용불가 (red)
  존재하지 않는 정보이면 사용가능 (blue) 
 --> 


