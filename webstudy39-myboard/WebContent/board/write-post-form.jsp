<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="front">
	<input type="hidden" name="command" value="writePost">
	<input type="hidden" name="memberId" value="${sessionScope.memberVO.id }">
	<table class="table table-bordered">
		<tr>
			<td>제목</td><td><textarea name="ptitle" rows="1" cols="100" required="required"></textarea></td>
		</tr>
		<tr>
			<td>내용</td><td><textarea name="pcontent" rows="15" cols="100" required="required"></textarea></td>
		</tr>
	</table>
	<table style="margin-left: 90%; margin-right: 10%">
		<tr>
			<td><input type="submit" value="완료" class="btn btn-default"></td>
		</tr>
	</table>
</form>