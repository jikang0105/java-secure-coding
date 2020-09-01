<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findfail</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<script type="text/javascript">
	alert("<%= request.getParameter("id")%> 아이디를 가진 회원이 없습니다.");
	location.href = "index.jsp";
</script>
</body>
</html>