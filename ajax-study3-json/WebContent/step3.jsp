<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax(JSONArray)</title>
<style type="text/css">
	table{
		border-collapse: collapse;
	}
	table, th, td{
		border: 1px solid black;
	}
	th, td{
		padding: 10px;
	}
</style>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		// maker의 value가 공란이면 tbody의 내용을 지운다.
		var makerComp=document.getElementById("maker");
		var carComp = document.getElementById("carView");
		if(makerComp.value==""){
			carComp.innerHTML="";
			return;
		}
		xhr=new XMLHttpRequest();
		//alert(xhr);
		xhr.onreadystatechange=function(){ // 익명함수
			if(xhr.readyState==4&&xhr.status==200){
				//alert(xhr.responseText);
				// json array로 변환한다.
				var ja = JSON.parse(xhr.responseText);
				//table의 tbody에 tr td를 추가한다.
				var tb="";				
				for(var i=0; i < ja.length; i++){
					tb+="<tr>";
					tb+="<td>"+(i+1)+"</td>";
					tb+="<td>"+ja[i].model+"</td>";
					tb+="<td>"+ja[i].price+"</td>";
					tb+="</tr>";
				}				
				carComp.innerHTML=tb;
			}// if
	
		}// callback
		xhr.open("get","CarJSONServlet?maker="+makerComp.value);
		xhr.send();
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
<br><br><br><br>
<table>
	<thead>
		<tr>
			<th>NO</th><th>MODEL</th><th>PRICE</th>
		</tr>
	</thead>
	<tbody id="carView"></tbody>
</table>
</body>
</html>