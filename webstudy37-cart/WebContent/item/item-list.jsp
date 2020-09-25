<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h4>아이템 리스트</h4>
<table class="table">
    <thead>
      <tr>
        <th>번호</th>
        <th>제품명</th>
        <th>제조사</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.list }" var="list">
      <tr>
        <td>${list.itemNo}</td>
        <td><a href="${pageContext.request.contextPath }/front?command=itemDetail&itemNo=${list.itemNo }">${list.name }</a></td>
        <td>${list.maker }</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>