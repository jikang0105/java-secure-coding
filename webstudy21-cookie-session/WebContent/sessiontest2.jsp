<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessiontest2</title>
</head>
<body>
sessiontest2 jsp에서 java로 생성될 때 세션이 자동으로 생성되지 않도록 처리한다.
<%
	// 위 지시자 테그에서 session="false"를 명시하여 세션을 생성하는 코드가 생성되지 않으므로 
	// session을 명시할 수 없다.
	//session.getId(); // compile error
	HttpSession session = request.getSession(false);
	if(session==null){
%>
		세션이 없습니다. <br><a href = "SessionOne">SessionOne으로 이동</a>
<%	} else { %>
		기존 세션이 있습니다. <%= session.getId() %>
<%	} %>
</body>
</html>