<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDAO dao = new MemberDAO();
	String id = request.getParameter("memberId");
	MemberVO vo = dao.findMemberById(id);
	if(vo!=null){
%>
	아이디 : <%= vo.getId() %>
	이름 : <%= vo.getName() %>
	주소 : <%= vo.getAddress() %>
<% } else { %>
	<script type = "text/javascript">
		alert("<%=id%> 에 해당하는 회원이 없습니다");
		location.href="findMemberById-form.jsp";
	</script>
<% }  %>
</body>
</html>