<%@page import="org.kosta.model.CarDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>car list</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class = "col-sm-6 col-sm-offset-3">
				<table class="table table-hover table-bordered">
					<thead>
						<tr class="success">
							<th>carNo</th><th>model</th>
						</tr>
					</thead>	
					<tbody>
			<%
					ArrayList<CarDTO> list = (ArrayList<CarDTO>)request.getAttribute("list");
					for(int i = 0; i < list.size(); i++){
			%>
						<tr>
							<td><%= list.get(i).getCarNo() %></td><td><%=list.get(i).getModel() %></td>
						</tr>
			<%
					}
			%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>