<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:forward page="front">
	<jsp:param value="home" name="command"/>
</jsp:forward>
<%--
			index.jsp -- command=home -- HomeController -- ItemDAO getAllItemList():ArrayList<ItemDTO>
																|
																| forward
																item/item-list.jsp : 레이아웃 적용된 상태에서 메인화면에 아이템 목록을 제공한다.		
														
--%>