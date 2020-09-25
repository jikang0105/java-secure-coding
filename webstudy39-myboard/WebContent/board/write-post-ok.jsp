<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
글쓰기가 완료되었습니다.
<form action="front">
	<input type="hidden" name="command" value="getAllPostList">
	<input type="submit" value="확인">
</form>