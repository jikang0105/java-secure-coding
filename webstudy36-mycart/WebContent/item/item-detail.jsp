<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	function checkInputItem(){
		if(confirm("${requestScope.idto.name}을 장바구니에 담으시겠습니까?")){
			/* location.href="${pageContext.request.contextPath}/front?command=inputIntoCart&inputitem=" + ${requestScope.idto.itemNo}; */
			return true;
		} else {
			return false;
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
	<c:choose>
	<c:when test="${sessionScope.memberDTO != null }">
	<tr>
		<td colspan="2">
			<form action="${pageContext.request.contextPath}/front" method="post" onsubmit="return checkInputItem()">
				<input type="hidden" name="command" value="addIntoCart">
				<input type="hidden" name="inputedItem" value="${requestScope.idto.itemNo}">
				<input type="submit" value="장바구니에 담기">
			</form>
		</td>
	</tr>
	</c:when>
	</c:choose>
</table>