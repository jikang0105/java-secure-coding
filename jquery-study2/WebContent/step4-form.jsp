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
<title>form</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#testForm").submit(function(){
			//alert("submit");
			// userId라는 id를 가진 입력양식의 value(val())을 출력한다
			// alert 출력한 후 val("")를 이용해서 정보를 삭제한 후
			// 포커스를 준다 focus();
			//alert($("#userId").val());
			//$("#userId").val("").focus();
			
			//select option 값을 출력한다.
			//alert($("#hp").val());
			
			// radio button은 특성상 동일한 name을 가진다
			// testForm id의 form 요소 중 radio name이 gender인 대상을 선택해서
			// 사용자가 체크한 라디오 버튼의 값을 출력해본다
			/* var ra = $("#testForm :radio[name=gender]:checked");
			//alert(ra.length);
			if(ra.length==0){
				alert("성별을 선택하세요!");
			} else {
				alert(ra.val());
			} */
			
			// testForm checkbox중 선택된 요소 값만 출력한다.
			var ha = $("#testForm :checkbox[name=hobby]:checked");
			//alert(ha.length);
			if(ha.length==0){
				alert("취미를 선택하세요!");
			} else {
				for(var i = 0; i < ha.length; i++){
					// ha는 jquery객체이지만 ha[i]는 javascript객체이다
					// val()과 같은 jquery 함수를 적용하려면
					// $(ha[i])와 같이 jquery 객체로 만들어야 적용가능하다.
					alert($(ha[i]).val());
				}
			}
			return false; // 전송되지 않도록 한다.
		});
	});
</script>
</head>
<body>
<form action="test.jsp" id="testForm">
 아이디 <input type="text" id="userId" name="userId"><br><br>
 <select id="hp">
  <option value="">--</option>
  <option value="sk">sk</option>
  <option value="kt">kt</option>
  <option value="lg">lg</option>
 </select><br><br>
 <input type="radio" name="gender" value="male">남 
 <input type="radio" name="gender" value="female">여 
 <br><br><br>
 <input type="checkbox" name="hobby" value="노래">노래<br>
 <input type="checkbox" name="hobby" value="코딩">코딩<br>
 <input type="checkbox" name="hobby" value="독서">독서<br>
 <input type="submit" value="전송">
</form>
</body>
</html>