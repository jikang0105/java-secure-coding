<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="register-form.jsp">상품등록</a>&nbsp;&nbsp;&nbsp;
<hr>
<table>
	<thead>
		<tr>
			<th>ID</th><th>NAME</th><th>REGISTER DATE</th>
		</tr>
	</thead>
	<tbody>
		<%
			ArrayList<ProductVO> productlist = (ArrayList<ProductVO>)request.getAttribute("productlist");
			for(int i = 0; i < productlist.size(); i++){
		%>
		<tr>
			<td><%= productlist.get(i).getId() %></td>
			<%-- 상품 상세 정보 링크를 제공한다
																			ProductDAO
				command = detailProduct --> ProductDetailController <--> findProductById(id)
				   |
			 detail-product.jsp
			 --%>
			<td><a href="front?command=detailProduct&id=<%= productlist.get(i).getId()%>"><%= productlist.get(i).getName() %></a></td>
			<td><%= productlist.get(i).getRegDate()%></td>
		</tr>
		<%
			}
		%>
	</tbody>
</table>

</div>
</body>
</html>