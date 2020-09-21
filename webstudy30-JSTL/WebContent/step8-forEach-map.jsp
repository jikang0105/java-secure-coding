<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="model.PersonVO"%>
<%@page import="java.util.LinkedHashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl forEach map</title>
</head>
<body>
<%
		LinkedHashMap<String, PersonVO> map = new LinkedHashMap<String, PersonVO>();
		map.put("a", new PersonVO("김태희", 40));
		map.put("b", new PersonVO("정지훈", 40));
		map.put("c", new PersonVO("유재석", 42));
		session.setAttribute("personMap", map);
		// 위 코드는 컨트롤러에서 할당되었다고 가정한다.
%>
기존 scriptlet 방식으로 세션에 저장된 map의 key와 value를 출력한다.<br><br>
<% 	@SuppressWarnings("unchecked")
		LinkedHashMap<String, PersonVO> rMap = (LinkedHashMap<String, PersonVO>)session.getAttribute("personMap");
		// rMap의 key와 value를 순차적으로 출력한다.
		Set<String> set = rMap.keySet();
		// set으로부터 iterator()를 호출해서 Iterator 객체를 반환받는다
		// Iterator의 hasNext() 와 next()를 이용해 key를 추출한다.
		// 추출한 key로부터 rMap의 key에 해당하는 value를 rMap.get(key) 형태로 반환받는다.
		/*
			key : a		value : 김태희
			key : b		value : 정지훈
			key : c		value : 유재석
		*/
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
%>
			key: <%= key %>		value: <%= rMap.get(key).getName() %>	<br>
<%
		}
%>
<hr>
2. JSTL forEach로 map의 key와 value를 순차적으로 출력한다. <br><br>
<c:forEach items="${sessionScope.personMap}" var="person">
	 key: ${person.key }		value: ${person.value.name } <br>  
</c:forEach>
</body>
</html>