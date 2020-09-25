<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
			RegisterItemController -- ItemDAO registerItem(dto)
				|
				| redirect
			item/item-register-result.jsp  alert() 상품등록완료 후 home으로 이동한다.
 --%>
<form action="${pageContext.request.contextPath}/front" method="post">
	<input type="hidden" name="command" value="itemRegister">
	<table class="table table-bordered detailTable">
		<tr>
			<td>상품명</td><td> <input type="text" name="itemName" required="required"></td>
		</tr>
		<tr>
			<td>제조사</td><td> <input type="text" name="itemMaker" required="required"></td>
		</tr>
		<tr>
			<td>가격</td><td> <input type="number" name="itemPrice" required="required"></td>
		</tr>
		<tr>
			<td>상세설명</td><td><textarea rows="5" cols="co" name="itemDetail" required="required"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="상품등록">
			</td>
		</tr>
	</table>
</form>