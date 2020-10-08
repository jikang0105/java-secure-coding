<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>JSONObject와 JSONArrayTest</title>
<script type="text/javascript">
	function testObj(){
		//alert("jsonobject test");
		var per={name:"조정석", age: 35}; // 자바스크립트 객체(JSON:Javascript Object Notation)
		alert(per.name+" "+per.age);
	}
	function testArray(){
		var pa=["ioc","aop","springmvc"];// 자바스크립트 배열 객체( JSON Array )
		for(var i=0; i < pa.length; i++){
			alert(pa[i]);
		}
	}
	// 자바스크립트 생성자
	function Person(name, age){
		this.name=name;
		this.age=age;
	}
	function testPerson(){
		//자바스크립트 생성자를 이용해 객체생성
		var p=new Person("조승우", 39);
		alert(p.name);
		alert(p.age);
	}
</script>
</head>
<body>
	<div class="container">
		<input type="button" value="JSONObject Test" onclick="testObj()">
		<input type="button" value="JSONArray Test" onclick="testArray()">
		<input type="button" value="JavascriptObject" onclick="testPerson()">
	</div>
</body>
</html>