<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- 
			FindItemController
				| forward 해서
			find-item-result.jsp 에서
			아이디 ( ... ) 상품 : 참이슬 후레쉬
 --%>
<form action="${pageContext.request.contextPath }/front">
<input type="hidden" name="command" value="FindItem">
상품 아이디 <input type="text" name="productId">
<input type="submit" value="검색">
</form>