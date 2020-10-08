<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr;
	var modelComp;
	var priceComp;
	function startAjax(){
		var makerComp=document.getElementById("maker");
		modelComp=document.getElementById("modelView");
		priceComp=document.getElementById("priceView");
		// maker가 비어있으면 기존 modelView와 priceView를 지운다
		if(makerComp.value==""){
			modelComp.innerHTML="";
			priceComp.innerHTML="";
			return; // 실행을 중단한다.
		}
		xhr = new XMLHttpRequest();
		//alert(xhr);
		// 요청에 대한 응답이 완료되면 실행될 함수를 등록한다.
		xhr.onreadystatechange=callback;
		xhr.open("get","FindCarJSONServlet?maker="+makerComp.value);
		xhr.send();// 요청이 완료
	}
	function callback(){
		if(xhr.readyState==4&&xhr.status==200){
			//alert(xhr.responseText);
			// 응답받은 정보를 json(javascript object)으로 변환한다.
			var json=JSON.parse(xhr.responseText);
			//alert(json.model);
			//alert(json.price);
			modelComp.innerHTML=json.model;
			priceComp.innerHTML=json.price;
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
모델<span id="modelView"></span> 가격<span id="priceView"></span>
</body>
</html>