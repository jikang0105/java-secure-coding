<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id 사용불가 팝업</title>
<script type="text/javascript">
	var of=window.opener.registerForm;
	of.id.value="";
	of.flag.value="";
	function closePopup(){
		of.id.focus();
		self.close();
	}
</script>
</head>
<body bgcolor="orange" onunload="closePopup()">
<%=request.getParameter("id")%>아이디는 사용불가 <br><br>
<input type="button" value="확인" onclick="closePopup()">
</body>
</html>












