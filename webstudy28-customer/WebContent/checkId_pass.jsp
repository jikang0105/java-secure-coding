<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
		var of = window.opener.joinForm;
		of.saveCheckId.value="<%= request.getParameter("userId")%>";
		function closePopup(){
			of.userPass.focus();
			self.close();
		}
	</script>
</head>
<body onunload="closePopup()">
	아이디 ( <%= request.getParameter("userId") %> ) 사용가능<br><br> 
	<input type="button" value="확인" onclick="closePopup();">
</body>
</html>