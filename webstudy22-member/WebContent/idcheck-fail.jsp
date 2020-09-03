<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<script type="text/javascript">
		var of=window.opener.registerForm;
		of.id.value="";
		of.flag.value="";
	function closePopup(){
		of.id.focus;
		self.close();
	}
</script>
</head>
<body bgcolor="lightgray" onunload="closePopup()">
<div class="container">
<%= request.getParameter("id") %>에 중복되는 아이디가 존재합니다.
<input type="button" value="확인" onclick="closePopup()">
</div>
</body>
</html>