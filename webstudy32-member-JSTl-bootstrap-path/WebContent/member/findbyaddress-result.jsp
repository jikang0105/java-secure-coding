<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>회원관리홈</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/myhome.css"/>
</head>
<body>
	<div class="container">
		<div class="row header">
			<div class="col-sm-12">
				<c:import url="/template/header.jsp"></c:import>
			</div>
		</div>
		<div class="row main">
			<div class="col-sm-8">
				<h4>판교에 사는 회원 명단</h4>
				<table class="table table-hover table-bordered">
					<thead>
						<tr>
							<th>NUM</th>
							<th>ID</th>
							<th>NAME</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.list }" var="rlist" varStatus="order">
						<tr>
							<td>${order.count }</td>
							<td>${rlist.id }</td>
							<td>${rlist.name }</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-sm-4">
				<c:import url="/template/right.jsp"></c:import>
			</div>
		</div>
		<div class="row footer">
			<div class="col-sm-12">
				<c:import url="/template/footer.jsp"></c:import>
			</div>
		</div>
	</div>
</body>
</html>