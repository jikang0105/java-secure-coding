<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String name = request.getParameter("userName");
	int age = Integer.parseInt(request.getParameter("userAge"));
	if(age > 19){
%>
		<%= name %>  님 즐거운 영화관람되세요.
<% } else { %>
		
		<script type = "text/javascript">
			alert("본 영화는 성인영화이므로 19세 이하는 관람하실 수 없습니다.");
			location.href = "step6-child.jsp"
		</script>
<%				
	}
%>
</body>
</html>