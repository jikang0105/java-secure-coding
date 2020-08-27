<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<String> list = new ArrayList<String>();
	list.add("이정재");
	list.add("정우성");
	list.add("현빈");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step4-select-onchange</title>
<script type = "text/javascript">
	function sendActor(){
		var actor = document.ActorForm;
		if(actor.actor.value===""){
			alert("옵션은 선택하세요!");
		} else {
			actor.submit();
		}
	}
</script>
</head>
<body>
	<form action = "step4-select-action.jsp" name = "ActorForm">
		<select name = "actor" onchange = "sendActor()"  required = "required">
			<option value = "">-남성배우-</option>
			<% for(int i = 0; i < list.size(); i++){ %>
			<option value = "<%= list.get(i) %>"><%= list.get(i) %></option>
			<% } %>
		</select>
		<!-- <input type = "submit" value = "선택"> -->
	</form>
	<%-- step1. option을 list를 활용해서 3개 만든다
		 step2. step4-select-action.jsp는 선택한 꽃 이미지를 보여준다.
	 --%>
</body>
</html>