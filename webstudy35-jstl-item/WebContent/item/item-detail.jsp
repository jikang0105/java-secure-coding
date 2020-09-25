<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table detailTable">
	<tr>
		<td>NO</td><td>${requestScope.idto.itemNo }</td>
	</tr>
	<tr>
		<td>Name</td><td>${requestScope.idto.name }</td>
	</tr>
	<tr>
		<td>Maker</td><td>${requestScope.idto.maker }</td>
	</tr>
	<tr>
		<td>Price</td><td>${requestScope.idto.price }</td>
	</tr>
	<tr>
		<td>Detail</td><td><pre>${requestScope.idto.detail }</pre></td>
	</tr>
</table>