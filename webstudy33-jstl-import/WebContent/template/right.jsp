<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- forward case --%>
<a href="${pageContext.request.contextPath }/front?command=FindItemForm">상품검색</a>
<br>
<%-- redirect case --%>
<a href="${pageContext.request.contextPath }/front?command=ItemRegistForm">상품등록</a>