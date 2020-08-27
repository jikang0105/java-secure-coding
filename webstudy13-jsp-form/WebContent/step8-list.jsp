<%@page import="model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type = "text/css" rel = "stylesheet" href = "css/mystyle.css">
</head>
<body>
<%
	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	list.add(new MemberVO("java", "정우성", "판교", "남"));
	list.add(new MemberVO("tomcat", "아이유", "강남", "여"));
	list.add(new MemberVO("model2", "한예슬", "종로", "여"));
%>
	<table>
		<thead>
			<tr>
				<th>순번</th><th>이름</th><th>주소</th><th>성별</th>
			</tr>
		</thead>
		<tbody>
			<%-- tr td를 list를 이용해서 동적으로 생성하되 이름부분은 링크를 부여해  id가 전송되도록 한다. --%>
			<% for(int i = 0; i < list.size(); i++){ %>
			<tr>
				<th><%= i + 1 %></th><th><a href = "step8-action.jsp?id=<%= list.get(i).getId()%>"><%= list.get(i).getName() %></a></th>
				<th><%= list.get(i).getAddress() %></th><th><%= list.get(i).getGender() %></th>
			</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>