<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	alert("아이디 (${param.id})에 대한 정보가 없습니다.");
	location.href="${pageContext.request.contextPath}/front?command=findMemberByIdForm";
</script>