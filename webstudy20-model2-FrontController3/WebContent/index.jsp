<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품관리</title>
</head>
<body>
	<h4>Model(MVC + FrontController) 상품관리</h4>
	<ul>
		<%-- DispatcherServlet에서 요청처리(TotalCountController) 후 count-view.jsp에서 응답한다. --%>
		<li><a href = "front?command=totalCount">전체 상품수 조회</a></li>
		<li><a href = "find-product-by-id.jsp">아이디로 상품 조회하기</a></li>
		<%--
				index -- front -- HandlerMapping -- ProductListController -- ProductDAO
						   |												 getAllProductList()
						   | forward
						product-list.jsp
					command = getallproductlist	
		 --%>
		 <li><a href = "front?command=selectAll">전체 상품목록 조회</a></li>
				 
		 <li><a href = "front?command=selectMaker">입점 제조사 조회</a></li>
		 
		 <li><a href = "insert-product.jsp">신규 상품 입력</a></li>
	</ul>
</body>
</html>