<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/myhome.css" />
</head>
<body>
	<div class="container">
		<div class="row header">
			<div class="col-sm-12">
				<h3>
					<a href="${pageContext.request.contextPath}/front?command=home">Home
						logo</a>
				</h3>
			</div>
		</div>
		<div class="row main">
			<div class="col-sm-8">
				<%--
			메인 화면에 대한 view 정보(url or jsp파일명)를 컨트롤러에서
			동적으로 할당받는다 
	 --%>
				<c:import url="${requestScope.url}" />
			</div>
			<div class="col-sm-4">
				<c:choose>
					<c:when test="${sessionScope.mvo==null}">
						<a 	href="${pageContext.request.contextPath}/front?command=registerForm">회원가입</a>
						<form method="post"
							action="${pageContext.request.contextPath}/front">
							<input type="hidden" name="command" value="login">
							<table>
								<tr>
									<td>아이디</td>
									<td><input type="text" name="id" required="required"></td>
								</tr>
								<tr>
									<td>패스워드</td>
									<td><input type="password" name="password"
										required="required"></td>
								</tr>
								<tr>
									<td colspan="2" align="right"><input type="submit"
										value="로그인"></td>
								</tr>
							</table>
						</form>
					</c:when>
					<c:otherwise>
						<%-- forward case  --%>
						<a	href="${pageContext.request.contextPath}/front?command=findMemberByIdForm">회원검색</a>
						<br>
						<a	href="${pageContext.request.contextPath}/front?command=findMemberByAddressForm">주소로 검색</a>
						<br>
							${sessionScope.mvo.name}  님 로그인 상태 <br>
						<a href="${pageContext.request.contextPath}/front?command=logout">로그아웃</a>
						<br>
						<a
							href="${pageContext.request.contextPath}/front?command=updateForm">회원정보수정</a>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<div class="row footer">
			<div class="col-sm-12">경기도 성남시 분당구 삼평동 대왕판교로 670길 유스페이스2 B동 8층
				TEL. 031-606-9311~20 Copyright © 2020 KOSTA ALL RIGHTS RESERVED</div>
		</div>
	</div>
</body>
</html>

















