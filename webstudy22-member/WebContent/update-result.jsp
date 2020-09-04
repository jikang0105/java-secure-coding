<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정결과화면</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
	<%
		HttpSession session = request.getSession(false);
	if (session != null && session.getAttribute("mvo") != null) {
		MemberVO mvo=(MemberVO)session.getAttribute("mvo");
	%>
	회원정보 수정 완료
	<br>
	<br> 아이디 <%=mvo.getId() %>
	<br> 패스워드 <%=mvo.getPassword() %>
	<br> 이름 <%=mvo.getName() %>
	<br> 주소 <%=mvo.getAddress() %>
	<br>
	<%
		} else {
	%>		<script type="text/javascript">
				alert("로그인하세요");
				location.href="login.jsp";
			</script>			
	<%
		}
	%>
	</div>
</body>
</html>













