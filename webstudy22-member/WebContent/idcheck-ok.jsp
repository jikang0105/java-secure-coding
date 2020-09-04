<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id사용가능팝업</title>
<script type="text/javascript">
	var of=window.opener.registerForm;
	of.flag.value="<%=request.getParameter("id")%>";
	function closePopup(){
		of.password.focus();
		self.close();
	}
</script>
</head>
<body bgcolor="yellow" onunload="closePopup()">
<%=request.getParameter("id")%> 아이디 사용가능 <br><br>
<input type="button" value="확인" onclick="closePopup()">
</body>
</html>











