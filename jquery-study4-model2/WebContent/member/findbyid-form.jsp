<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 
		ajax로 회원검색결과를 보여준다 
 --%>
<script>
	$(document).ready(function() {
		$("#findMemberBtn").click(function(){
			$.ajax({
				type: "get",
				url: "front",
				data:"command=findMemberById&id="+$("#memberId").val(),
				success:function(result){
					$("#resultView").text(result);
				}
			})
		})
	})
</script>
<form>
	<input type="text" id="memberId" placeholder="ID 입력하세요"	required="required"> 
	<input type="button" value="검색" 	id="findMemberBtn"><br> 
	<h4><span id="resultView"></span></h4>
</form>