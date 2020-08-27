<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	ArrayList<String> list=new ArrayList<String>();
	list.add("치킨");
	list.add("파스타");
	list.add("프로포즈");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>radio test</title>
</head>
<body>
	<%-- action.jap에서 파스타 주문 완료 --%>
	<form action = "step2-radio-action.jsp">
	<%--ArrayList를 이용해 라디오 버튼을 3개 생성하세요 --%>
		<%
			for(int i = 0; i < list.size(); i++){
		%>
		<input type = "radio" name = "menu" value="<%= list.get(i) %>" required = "required"> <%= list.get(i) %><br>
		<%
			}
		%>
		<input type = "submit" value = "주문">
	</form>
</body>
</html>