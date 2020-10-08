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
<title>jquery form</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#mybtn1").click(function(){
			alert($("#nickName").val());
			$("#nickName").val("").focus();// method chaining
		}); //mybtn
		$("#testForm").submit(function(){
			confirm($("#memberName").text()+" 전송하시겠습니까?");
			return false; // false를 리턴하면 전동되지 않는다
		});
	});
</script>
</head>
<body>
<!--  mybtn1 아이디 버튼1을 클릭하면  alert으로 nickName 아이디에
입력한 값이 출력되도록 한다  -->
<button type="button" id="mybtn1">버튼1</button>
<input type="text" id="nickName">
<hr>
<span id="memberName">아이유님</span>
<form action="test.jsp" id="testForm">
<input type="text" name="nick"  id="memberNick">
<!-- <input type="submit" value="전송"> -->
<button type="submit">전송</button>
<button type="reset">리셋</button>
</form>
<!--  전송버튼을 누르면 전송하시겠습니까 의사를 물어본 후
확인시에만 전송한다  -->
</body>
</html>



