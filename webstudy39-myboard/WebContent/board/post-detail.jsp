<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-bordered">
	<tr>
		<td>제목</td><td>${requestScope.postVO.ptitle}</td>
		<td>작성자</td><td>${requestScope.postVO.memberVO.name}</td>
		<td>번호</td><td>${requestScope.postVO.pno}</td>
	</tr>
	<tr>
		<td>내용</td><td colspan="5">${requestScope.postVO.pcontent }</td>
	</tr>
	<tr>
		<td>조회수</td><td>${requestScope.postVO.pcount }</td>
		<td>작성일시</td><td colspan="3">${requestScope.postVO.time_posted }</td>
	</tr>
</table>
<c:choose>
	<c:when test="${sessionScope.memberVO.id == requestScope.postVO.memberVO.id}">
		<table style="margin-left: 90%; margin-right: 10%">
			<tr>
				<td>
					<form action="front">
						<input type="hidden" name="command" value="deletePost">
						<input type="submit" value="삭제" class="btn btn-default">
					</form>
				</td>
				<td>
					<form action="front">
						<input type="hidden" name="command" value="updatePostForm">
						<input type="hidden" name="postNumber" value="${requestScope.postVO.pno}">
						<input type="submit" value="수정" class="btn btn-default">
					</form>
				</td>
			</tr>	
		</table>
	</c:when>
</c:choose>