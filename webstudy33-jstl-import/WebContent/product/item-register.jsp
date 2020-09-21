<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
상품 등록 페이지 입니다.
<form action="${pageContext.request.contextPath }/front" method="post">
<input type="hidden" name="command" value="ItemRegister">
상품 아이디 <input type="text" name="productId"><br>
<input type="submit" value="등록">
</form>