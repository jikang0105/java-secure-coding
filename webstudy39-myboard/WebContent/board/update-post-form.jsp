<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="front">
	<input type="hidden" name="command" value="updatePost">
	<input type="hidden" name="postNumber" value="${requestScope.postVO.pno }">
	<table class="table table-bordered">
		<tr>
			<td>제목</td><td><textarea name="ptitle" rows="1" cols="100" required="required">${requestScope.postVO.ptitle}</textarea></td>
		</tr>
		<tr>
			<td>내용</td><td colspan="5"><textarea name="pcontent" rows="15" cols="100" required="required">${requestScope.postVO.pcontent }</textarea></td>
		</tr>
	</table>
	<table style="margin-left: 90%; margin-right: 10%">
		<tr>
			<td><input type="submit" value="수정"></td>
		</tr>
	</table>
</form>