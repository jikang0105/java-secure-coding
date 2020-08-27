<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkbox</title>
<script type = "text/javascript">
	function chooseOrNot(){
		var flag = false;
		var checkArray = document.getElementsByName("actress");
		for(var i = 0; i < checkArray.length; i++){
			if(checkArray[i].checked){
				flag = true;
				break;
			}
		}
		if(flag === false){
			alert("아무것도 선택하지 않았습니다.");
		}
		return flag;
	}
</script>
</head>
<body>
<%
	ArrayList<String> list = new ArrayList<String>();
	list.add("박보영");
	list.add("한예슬");
	list.add("신민아");
%>
<%-- step1. ArrayList를 활용해 checkbox를 동적으로 생성한다.
	 step2. javascript로 체크박스를 하나 이상 서낵했을 때 서버에 전송한다.
	 		만양 아무 메뉴도 선택하지 않을 경우 alert으로 메뉴를 선택하세요를 띄우고 전송하지 않는다.
	 step3. step5-checkbox-action.jsp에서 전송받는 메뉴 정보를 테이블 형식으로 화면에 보여준다.
--%>
<form action = "step5-checkbox-action.jsp" onsubmit = "return chooseOrNot()">
	<% for(int i = 0; i < list.size(); i++){ %>
		<input type = "checkbox" name = "actress" value = "<%= list.get(i) %>"><%= list.get(i) %><br>
	<% } %>
	<input type = "submit" value = "확인">
</form>
</body>
</html>