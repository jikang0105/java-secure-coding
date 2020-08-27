<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "css/mystyle.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>순번</th><th>이름</th>
			</tr>
		</thead>
		<tbody>
			<%-- tr, td를 동적으로 보여준다. --%>
			<% String[] actress = request.getParameterValues("actress");
			   for(int i = 0; i < actress.length; i++){ %>
			  	<tr>
			  		<th><%= i+1 %></th><th><%= actress[i] %></th>
				</tr>
			<% } %>	  	
		</tbody>
	</table>
</body>
</html>