<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
회원정보수정 완료
아이디 : ${sessionScope.mvo.id}<br>
비밀번호 : ${sessionScope.mvo.password}<br>
이름 : ${sessionScope.mvo.name}<br>
주소 : ${sessionScope.mvo.address}<br>