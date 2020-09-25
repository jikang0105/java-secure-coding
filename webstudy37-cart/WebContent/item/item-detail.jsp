<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	function addCartBtn(){
		if(confirm("장바구니에 상품을 담으시겠습니까?")){
			//var f=document.getElementById("addCartForm");
			//alert(f);
			// command=addcart -> AddCartController -> addcart-result.jsp 
			//javascript form submit
			document.getElementById("addCartForm").submit();
		} 
	}
</script>
<table class="table detailTable">
	<tr>
		<td>NO</td><td>${requestScope.idto.itemNo }</td>
	</tr>
	<tr>
		<td>Name</td><td>${requestScope.idto.name }</td>
	</tr>
	<tr>
		<td>Maker</td><td>${requestScope.idto.maker }</td>
	</tr>
	<tr>
		<td>Price</td><td>${requestScope.idto.price }</td>
	</tr>
	<tr>
		<td>Detail</td><td><pre>${requestScope.idto.detail }</pre></td>
	</tr>
	<c:if test="${sessionScope.memberDTO != null }">
	<tr>
		<td colspan="2" align="center">
			<form action="front" method="post" id="addCartForm">
				<input type="hidden" name="command" value="addcart">
				<input type="hidden" name="itemNo" value="${requestScope.idto.itemNo}">
				<input type="button" onclick="addCartBtn()" value="장바구니에 담기">
			</form>
		</td>
	</tr>
	</c:if>
</table>