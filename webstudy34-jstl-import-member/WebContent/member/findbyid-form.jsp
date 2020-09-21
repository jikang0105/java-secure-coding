<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- 
			findbyid-form.jsp
			FindMemberByIdController
			|
			findbyid-fail.jsp에서는 alert후 home으로 이동
			(해당 파일로 forward)
			findbyid-ok.jsp에서는 layout이 적용되어야 한다.
--%>
<form action="${pageContext.request.contextPath}/front">
	<input type="hidden" name="command" value="findMemberById">
	아이디 <input type="text" name="id" required="required">
	<input type="submit" value="검색">
</form>