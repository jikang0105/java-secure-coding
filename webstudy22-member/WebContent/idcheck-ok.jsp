<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id사용가능</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<script type="text/javascript">
	var of=window.opener.registerForm;
	of.flag.value="<%= request.getParameter("id")%>";
	function closePopup(){
		of.password.focus();
		self.close();
	}
</script>
</head>
<body bgcolor="lightgray" onunload="closePopup()">
<div class="container">
<%= request.getParameter("id") %>에 중복되는 아이디가 없습니다.
<input type="button" value="확인" onclick="closePopup()">
</div>
</body>
</html>