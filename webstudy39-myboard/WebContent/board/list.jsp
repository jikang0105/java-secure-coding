<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-border">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일시</th>
			<th>조회수</th>
		<tr>
	</thead>
		<c:forEach items="${requestScope.list}" var="list">
			<tr>
				<td>${list.pno}</td>
				<c:choose>
					<c:when test="${sessionScope.memberVO != null}">
						<td><a href="${pageContext.request.contextPath}/front?command=getPostDetail&no=${list.pno}">${list.ptitle}</a></td>
					</c:when>
					<c:otherwise>
						<td>${list.ptitle}</td>
					</c:otherwise>
				</c:choose>
				<td>${list.memberVO.name}</td>
				<td>${list.time_posted}</td>
				<td>${list.pcount}</td>
			</tr>
		</c:forEach>
	<tbody>
	</tbody>
</table>