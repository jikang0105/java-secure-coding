<%@page import="java.util.Map"%>
<%@page import="org.kosta.model.ItemDTO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table">
	<thead>
		<tr>
			<th>상품명</th>
			<th>제조사</th>
			<th>가격</th>
			<th>삭제</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${sessionScope.cart}" var="cart">
		<tr>
			<td>${cart.value.name }</td>
			<td>${cart.value.maker }</td>
			<td>${cart.value.price }</td>
			<td>
				<form action="${pageContext.request.contextPath }/front">
					<input type="hidden" name="command" value="deleteItem">
					<input type="hidden" name="deleteItemNo" value="${cart.value.itemNo }">
					<input type="submit" value="삭제">
				</form>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				<%-- 
				<%
	            @SuppressWarnings("unchecked")
	            HashMap<String, ItemDTO> cart=(HashMap<String, ItemDTO>)request.getSession(false).getAttribute("cart");
	            int totalPrice=0;
	            for(Map.Entry<String, ItemDTO> entry : cart.entrySet()) {
	       			totalPrice += entry.getValue().getPrice();
	       		 }
	            %>
	         	총액 :<%= totalPrice%> --%>
	         	<%-- 총액 : 	${sessionScope.totalPrice } --%>
	         	<c:set var="count" value="0"/>
	         	<c:forEach items="${sessionScope.cart }" var="cart">
	         		<c:set var="count" value="${count + cart.value.price }"/>
	         	</c:forEach>
	         	총액 : <c:out value="${count }"/>
         	</td>			
		</tr>
	</tbody>
	
</table>