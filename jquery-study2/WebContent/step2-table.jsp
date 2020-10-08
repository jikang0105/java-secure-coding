<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
  <title>jquery table</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  	$(document).ready(function(){
  		// id testBtn을 클릭하면 자신의 value를 출력하도록 이벤트를 등록한다.
  		$("#testBtn").click(function(){
  			//alert($(this).val());
  			// id가 friend인 하위 tr에만 css를 적용한다
			//$("#friend tr").css("background", "yellow");  			
  			//alert($("#friend tr").text());
  			//alert($("#friend tr").html());
  			//alert($("#friend tr:eq(1)").html());
  			//alert($("#friend").html());
  			// tbody id friend의 하위 tr 중 세번째 tr을 선택한다.
  			//$("#friend tr:eq(2)").css("background", "yellow");
  			// tbody id friend의 td 중 '당'이라는 문자열이 포함된 td만 선택한다.
  			//$("#friend td:contains(당)").css("background", "yellow");
  		}); // testBtn event
  		$("#friend td").click(function(){
  			/* $(this).css("background", "yellow");
  			alert($(this).text()); */
  			//$(this).css("background", "white"); */
  			// 클릭된 td의 상위(부모) tr로 이동하여 그tr이 가진 첫번째 td의 텍스트를 출력한다.
  			/* var info=$(this).parent().children().eq(0).text(); // 메서드 체이닝
  			alert(info); */
  		})
  	});
  </script>
</head>
<body>

<div class="container">
  <input type="button" value="테스트" id="testBtn">
  <p>jquery로 table 제어</p>            
  <table class="table table-bordered table-hover">
    <thead>
      <tr>
        <th>이름</th>
        <th>나이</th>
        <th>주소</th>
      </tr>
    </thead>
    <tbody id="friend">
      <tr>
        <td>아이유</td>
        <td>28</td>
        <td>동탄</td>
      </tr>
      <tr>
        <td>김연아</td>
        <td>24</td>
        <td>사당</td>
      </tr>
      <tr>
        <td>김태리</td>
        <td>27</td>
        <td>분당</td>
      </tr>
    </tbody>
  </table>
</div>
</body>
</html>