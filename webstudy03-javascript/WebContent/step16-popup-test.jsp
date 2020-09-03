<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업 테스트</title>
<script type="text/javascript">
	function openPopup(){
		//alert("팝업테스트");
		// step1. 팝업 jsp 파일명, step2. 별칭, step3. 팝업옵션
		window.open("step17-popup.jsp", "mypopup", "width=450, height=250, top=150, left=200");
	}
	function showHidden(){
		alert(document.testForm.flag.value);
	}
</script>
</head>
<body>
<form name="testForm">
<input type="hidden" name="flag" value="fail">
닉네임 <input type="text" name="nickName"><br>
<input type="button" value="팝업창 띄우기" onclick="openPopup()"><br>
<input type="button" value="히든값확인" onclick="showHidden()">
</form>

</body>
</html>