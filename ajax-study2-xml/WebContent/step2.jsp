<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax(xml을 전송데이터로 이용)</title>
<script type = "text/javascript">
	var xhr;
	/* var modelComp;
	var priceComp; */
	function startAjax(){
		// select option value가 공란일때는 alert으로 메이커를 선택하세요 하고 실행중단한다.
		var makerComp = document.getElementById("maker");
		/* modelComp = document.getElementById("modelView");
		priceComp = document.getElementById("priceView"); */
		/* modelView = document.getElementById("modelView");
		priceView = document.getElementById("priceView"); */
		if(makerComp.value === ""){
			//alert("메이커를 선택하세요");
			modelView.innerHTML="";
			priceView.innerHTML="";
			return;
		}
		// alert("startAjax");
		// option을 선택하면 ajax 통신해서 span id carView 영역에 응답정보를 보여준다.
		xhr=new XMLHttpRequest();
		xhr.onreadystatechange = callback;
		xhr.open("get", "FindCarXMLServlet?maker="+makerComp.value);
		xhr.send(null);
	}
	function callback(){
		if(xhr.readyState==4&&xhr.status==200){
			var dom=xhr.responseXML;
			var carVal=dom.getElementsByTagName("car");
			//alert(carVal.length);
			/* alert(carVal[0].childNodes[0].nodeName); //model
			alert(carVal[0].childNodes[0].childNodes[0].nodeValue); // model의 정보
			alert(carVal[0].childNodes[1].nodeName); //price
			alert(carVal[0].childNodes[1].childNodes[0].nodeValue); // price의 정보 */
			/* modelComp.innerHTML=carVal[0].childNodes[0].childNodes[0].nodeValue;
			priceComp.innerHTML=carVal[0].childNodes[1].childNodes[0].nodeValue; */
			modelView.innerHTML=carVal[0].childNodes[0].childNodes[0].nodeValue;
			priceView.innerHTML=carVal[0].childNodes[1].childNodes[0].nodeValue;
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