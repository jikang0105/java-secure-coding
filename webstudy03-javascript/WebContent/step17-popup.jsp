<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업창</title>
<script type="text/javascript">
	function closePopup(){
		//alert("팝업창을 닫습니다.");
		// 자신을 실행시킨 본창은 opener 객체로 인식된다
		opener.document.testForm.nickName.value="";
		opener.document.testForm.nickName.focus();
		// 자신(팝업)을 종료한다
		opener.document.testForm.flag.value="ok";
		self.close();
	}
</script>
</head>
<body bgcolor="lightgray" onunload="closePopup()">
팝업창입니다. <br><br>
<input type="button" value="확인" onclick="closePopup()">
</body>
</html>