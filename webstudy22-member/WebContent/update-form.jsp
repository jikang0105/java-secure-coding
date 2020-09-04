<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정폼</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<%
		// 로그인한 사용자인지 확인 ( 세션 유무와 세션 내의 인증정보 유무 )
		// request.getSession(false) : 기존 세션이 있으면 기존 세션 객체 리턴 , 없으면 null 리턴 
		HttpSession session=request.getSession(false);
		if(session!=null&&session.getAttribute("mvo")!=null){
			MemberVO mvo=(MemberVO)session.getAttribute("mvo");			
%>
			<h4>회원정보수정</h4>
			<form method="post" action="front">
				<input type="hidden" name="command" value="updateMember">
				<%-- readonly="readonly" 수정불가 --%>
				아이디 <input type="text" name="id" readonly="readonly" value="<%=mvo.getId()%>"><br>
				패스워드 <input type="text" name="password" value="<%=mvo.getPassword()%>"><br>
				이름 <input type="text" name="name" value="<%=mvo.getName()%>"><br>
				주소 <input type="text" name="address" value="<%=mvo.getAddress()%>"><br>
				<input type="submit" value="수정하기">
			</form>
			
<%    }else{ %>
		  로그인하세요 <a href="login.jsp">로그인페이지로</a>	
<%		} %>
</div>
</body>
</html>














