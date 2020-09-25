<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	function deleteItem(){
		if(confirm("정말 삭제하시겠습니까?")){
				document.getElementById("deleteItemForm").submit();
		}
	}
</script>
<c:choose>
	<c:when test="${empty sessionScope.memberDTO.cart.itemList}">
		상품 없음
	</c:when>
	<c:otherwise>
		<table class="table table-bordered detailTable">
			<caption>장바구니</caption>
			<c:forEach items="${sessionScope.memberDTO.cart.itemList}" var="item">
			<tr>
				<td>${item.itemNo }</td><td>${item.name }</td><td>${item.maker }</td><td>${item.price }</td>
				<td>
					<form action="front" method="post" id="deleteItemForm">
						<input type="hidden" name="command" value="deleteCart">
						<input type="hidden" name="itemNo" value="${item.itemNo }">
						<input type="button" onclick="deleteItem()" value="삭제">
					</form>
				</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="5" align="center">총액 : ${sessionScope.memberDTO.cart.totalPrice }</td>
			</tr>
		</table>
	</c:otherwise>
</c:choose>