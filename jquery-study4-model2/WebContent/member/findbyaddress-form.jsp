<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 
		ajax로 주소에 대한 회원검색결과를 보여준다 
 --%>
<script>
	$(document).ready(function() {
		$(address).change(function(){
			$("#membody").empty();
			if($("#address").val()==""){
				return;
			}
			$.ajax({
				type: "get",
				url: "front",
				data: $("#addressForm").serialize(),
				dataType: "json",
				success: function(json){
					for(var i=0; i<json.length;i++){
					$("#membody").append(
							"<tr><td>"+json[i].id+"</td><td>"+json[i].name+"</td></tr>");
					}
				}
			})
		})
	})
</script>
<div class="row">
	<div class="col-sm-3 col-sm-offset-2">
		<form id="addressForm">
			<input type="hidden" name="command" value="findMemberByAddress">
			<select name="address" id="address">
				<option value="">---</option>
				<c:forEach items="${requestScope.list}" var="address">
					<option value="${address}">${address}</option>
				</c:forEach>
			</select>
		</form>
	</div>
	<div class="col-sm-3">
		<table class="table  table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
				</tr>
			</thead>
			<tbody id="membody">
			</tbody>
		</table>
	</div>
</div>
