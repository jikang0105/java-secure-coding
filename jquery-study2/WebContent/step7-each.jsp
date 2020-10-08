<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>step5-checkbox</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#menuForm").submit(function(){
			var menu = $("#menuForm :checkbox[name=menu]:checked")
			var menuArr="";
			if(menu.length==0){
				alert("메뉴를 선택하세요");
				return false;
			} else {
				/* for(var i=0; i < menu.length; i++){
					menuArr += $(menu[i]).val()+" ";
				}
				alert(menuArr+" 주문"); */
				// jquery each를 이용한다.
				menu.each(function(index){
					menuArr += index+"."+$(this).val()+" ";
				}).fadeOut(1000);
			}
			return confirm( menuArr+" 주문하시겠습니까?");
		})
	})
</script>
</head>
<body>
<form action="test.jsp" id="menuForm">
<input type="checkbox" name="menu" value="새우">새우<br>
<input type="checkbox" name="menu" value="삼겹살">삼겹살 <br>
<input type="checkbox" name="menu" value="김치찌개">김치찌개<br>
<input type="submit" value="주문">
</form> 
</body>
</html>