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
	
	String name = request.getParameter("studentName");
	int	score = Integer.parseInt(request.getParameter("studentScore"));
	String grade = "F";
	if(score > 89){
		grade = "A";
	} else if (score > 79){
		grade = "B";
	} else if (score > 69){
		grade = "C";
	}
%>
<%
	if(grade.equals("F")){
%>
		<script type = "text/javascript">
			alert("<%=name%> 님은  F학점입니다.");
			location.href = "step7-F.jsp?name=<%=name%>";
		</script>
<%
	} else {
%>
		<%= name %> 님은 <%= grade %>학점입니다. 
<%				
	} 
%>


</body>
</html>