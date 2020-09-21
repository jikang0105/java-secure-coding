<%@page import="org.kosta.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
	.content{
		height: 400px;
	}
	footer{
		background-color: black;
		color: white;
		padding: 15px;
	}
	.checkPass{
		display: none;
	}
	</style>
	
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="content">
<%
	HttpSession session = request.getSession(false);
	MemberDTO mvo = (MemberDTO)session.getAttribute("mvo");
%>
아이디 : <%= mvo.getId() %><br>
비밀번호 : *************** <br>
이름 : <%= mvo.getName() %><br>
주소 : <%= mvo.getAddress() %><br>
생일 : <%= mvo.getBirth() %><br>
회원가입일시 : <%= mvo.getJoinTime() %><br>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>