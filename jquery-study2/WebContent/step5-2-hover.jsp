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
<title>step5-hover.jsp</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("#membody td").hover(function(){
			$("#memInfo").text($(this).text());
			$(this).css("background", "yellow");
		}, function(){
			$("#memInfo").text("");
			$(this).css("background", "none");
		})
	})
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<!-- offset: 2비중만큼 오른쪽으로 이동 -->
			<div class="col-sm-8 col-sm-offset-2">
				<table class="table  table-bordered">
					<thead>
						<tr>
							<th>ID</th>
							<th>NAME</th>
							<th>ADDR</th>
						</tr>
					</thead>
					<tbody id="membody">
						<tr>
							<td>java</td>
							<td>아이유</td>
							<td>하와이</td>
						</tr>
						<tr>
							<td>jquery</td>
							<td>김태리</td>
							<td>울릉도</td>
						</tr>
						<tr>
							<td>ajax</td>
							<td>강동원</td>
							<td>백령도</td>
						</tr>
					</tbody>
				</table>
				<span id="memInfo"></span>
			</div>
		</div>
		<!--  row  -->
	</div>
	<!-- container -->
</body>
</html>