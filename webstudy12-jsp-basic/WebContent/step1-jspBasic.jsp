<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp basic</title>
</head>
<body>
<!-- html 주석 -->
<%-- jsp 주석(권장 client에게 보이지 않는다) --%>
jsp basic test <br><br>
<%
	for(int i = 0; i < 10; i++){
%>
		반갑습니다 jsp <br>
<%		
	}
%>
<hr>
<% Date d = new Date(); %>
현재 시간 : <%= d.toString() %>
<hr>
<%-- 인스턴스 변수 및 메서드를 선언해본다 --%>
<%!
	int count;
	public void test(){
		System.out.println("method test");
	}
%>
count : <%= count %>
<% test(); %>
</body>
</html>