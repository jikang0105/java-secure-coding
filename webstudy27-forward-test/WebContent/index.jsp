<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 현재 jsp가 홈으로 실행되면 바로 front인 DispatcherServlet이 실행되도록 처리한다. --%>
<jsp:forward page="front">
<jsp:param value="getAllCarList" name="command"/>
</jsp:forward>
