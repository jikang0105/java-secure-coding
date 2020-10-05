<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax</title>
<script type = "text/javascript">
	var xhr;
	function startAjax(){
		// select option value가 공란일때는 alert으로 메이커를 선택하세요 하고 실행중단한다.
		var makerComp = document.getElementById("maker");
		if(makerComp.value === ""){
			//alert("메이커를 선택하세요");
			document.getElementById("carView").innerHTML="";
			return;
		}
		// alert("startAjax");
		// option을 선택하면 ajax 통신해서 span id carView 영역에 응답정보를 보여준다.
		xhr=new XMLHttpRequest();
		xhr.onreadystatechange = callback;
		xhr.open("get", "FindCarServlet?maker="+makerComp.value);
		xhr.send(null);
	}
	function callback(){
		if(xhr.readyState==4&&xhr.status==200){
			var info = xhr.responseText;
			document.getElementById("carView").innerHTML=info;
		}
	}
</script>
</head>
<body>
<select id = "maker" onchange="startAjax()">
	<option value="">---</option>
	<option value="현대">현대</option>
	<option value="르노">르노</option>
	<option value="기아">기아</option>
</select>
<span id="carView"></span>
</body>
</html>