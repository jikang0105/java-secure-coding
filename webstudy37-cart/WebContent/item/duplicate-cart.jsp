<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	alert("이미 장바구니에 존재하는 물품입니다.")
	location.href="${pageContext.request.contextPath}/front?command=home";
</script>