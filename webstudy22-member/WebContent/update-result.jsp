<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a><br>
<hr>
<%
	HttpSession session = request.getSession(false);
	if(session != null && session.getAttribute("vo") != null){
		MemberVO vo = (MemberVO)session.getAttribute("vo");
		//if(vo != null){
%>
	회원정보 수정되었습니다.
	아이디 : <%= vo.getId() %><br>
	패스워드 : <%= vo.getPassword() %><br>
	이름 : <%= vo.getName() %><br>
	주소 : <%= vo.getAddress() %><br>
<%	
		// }
	} else {
%>
<script type="text/javascript">
	alert("로그인하세요");
	location.href="login.jsp";
</script>
<% } %>
</div>
</body>
</html>