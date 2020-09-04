<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색폼</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<div class="container">
		<a href="index.jsp">Home</a>
		<hr>
		<form method="get" action="front">
		<input type="hidden" name="command" value="findmemberbyid">
		아이디 <input type="text" name="id" required="required">
		<input type="submit" value="회원검색">
		</form>
	</div>
	<%--			FindMemberByIdController		MemberDAO
														findMemberById(String id) : MemberVO
								| forward
					findmemberbyid-ok.jsp
					아이디와 이름, 주소를 제공한다 
								or 
								findmemberbyid-fail.jsp
								javascript alert  :  머머 아이디를 가진 회원이 없습니다
								location.href 로  index.jsp로 이동시킨다 						
			
	 --%>
</body>
</html>























