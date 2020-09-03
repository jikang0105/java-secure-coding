<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인폼</title>
<link rel="stylesheet" type="text.css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<form method="post" action="front">
<input type="hidden" name="command" value="login">
아이디 <input type="text" name="id" required="required"><br>
패스워드 <input type="password" name="password" required="required"><br>
<input type="submit" value="로그인">
</form>
<%-- 
		login.jsp--command=login-->LoginController <--> login(MemberVO)
										|
										login-fail.jsp
										로그인 실패!alert 후
										index.jsp로 이동시킨다.
										login-ok.jsp
										아이유님 로그인하셨습니다.
										만약 상단부에 Home 링크를 클릭하면
										index.jsp에서는
										로그인 폼으로 링크를 보여주지 않고
										판교에 사는 아이유님 로그인 상태
										로그아웃 링크를 보여준다
										로그아웃 링크를 누르면
										LogoutController가 동작되고
										로그아웃 처리 후 
										index.jsp로 redirect한다.
										로그아웃 처리된 index.jsp는
										다시 로그인폼으로 라는 링크가 제공된다.
											
 --%>
</div>

</body>
</html>