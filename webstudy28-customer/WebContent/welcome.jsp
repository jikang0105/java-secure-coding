<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
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
	</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="content">
	<div class="col-sm-8">
	가입 회원수 : <%= request.getAttribute("count") %> 명
	</div>
	<div class="col-sm-4">
<%
	HttpSession session	 = request.getSession(false);
	if(session != null && session.getAttribute("mvo")!= null){
		MemberVO mvo = (MemberVO)session.getAttribute("mvo");
%>
	<%=  mvo.getName() %>님 로그인 상태입니다.
	<a href="info.jsp">회원정보조회</a><br>
<%	
		
	} else {
%>
	<jsp:include page="login_form.jsp"></jsp:include><br><br>
	<a href="join_form.jsp">회원가입하기</a><br>
<%
	}
%>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>