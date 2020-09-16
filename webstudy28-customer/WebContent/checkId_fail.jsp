<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkId_fail.jsp</title>
<script type="text/javascript">
	var of = window.opener.joinForm;
	of.userId.value="";
	of.saveCheckId.value="";
	function closePopup(){
		of.userId.focus();
		self.close();
	}
</script>
</head>
<body onunload="closePopup()">
아이디 ( <%= request.getParameter("userId") %> )는 사용할 수 없습니다.
<input type="button" value="확인" onclick="closePopup()">
</body>
</html>