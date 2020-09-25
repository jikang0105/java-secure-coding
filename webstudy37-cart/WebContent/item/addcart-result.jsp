<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	if(confirm("장바구니에 추가하였습니다. 장바구니로 이동하시겠습니까?")){
		location.href="${pageContext.request.contextPath}/front?command=cartView"
	} else {
		location.href="${pageContext.request.contextPath}/front?command=home"
	}
</script>