<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward test1</title>
</head>
<body>
<%-- 
	client에서 요청하면 Controller(Servlet)이 적절한 view를 선택해 응답하게 한다.
	select-form.jsp --request-->SelectServlet
									  |
							    forward 방식 이동
							    	  |
			<-- response --select_result.jsp(View)로 응답
						  
 --%>
 <form action = "SelectServlet">
 아이디 <input type = "text" name = "userId">
 <input type = "submit" value = "forward테스트">
 </form>
</body>
</html>