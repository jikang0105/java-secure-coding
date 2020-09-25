<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	alert("장바구니에 중복되는 아이템이 있습니다.");
	location.href="${pageContext.request.contextPath}/front?command=home";
</script>