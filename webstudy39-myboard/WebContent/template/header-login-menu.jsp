<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- jap:include or jstl import 대상이므로 html 선언부는 정의하지 않는다 --%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="${pageContext.request.contextPath}/front?command=getAllPostList">Home logo</a>
    </div>
    <c:choose>
		<c:when test="${sessionScope.memberVO == null}">
			<form class="navbar-form navbar-left" action="front" method="post">
     			<div class="form-group">
     				<input type="hidden" name="command" value="login">
       				<input type="text" class="form-control" placeholder="id" name="id"> <input type="password" class="form-control" placeholder="password" name="password">
     			</div>
      			<button type="submit" class="btn btn-default">Login</button>
    		</form>
		</c:when>
		<c:otherwise>
			<ul class="nav navbar-nav">
	      		<li><a href="${pageContext.request.contextPath}/front?command=writePostForm">글쓰기</a></li>
	      		<li><a href="#">Page 1</a></li>
	      		<li><a href="#">Page 2</a></li>
	   		</ul>
	   		<div style="color: white; text-align: right;">
	   		<br><br>
	   		[${sessionScope.memberVO.name} 님 로그인]
	   		<a href="front?command=logout">로그아웃</a>
	   		</div>
		</c:otherwise>
	</c:choose>
    </div>
</nav>
