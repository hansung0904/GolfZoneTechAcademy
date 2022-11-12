<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	var txt_json = '{"number":11,"user_name":"yangssem11","user_age":11}';
	var txt_jsons = '[{"num":11,"name":"yangssem11","age":11},'
			+ '{"num":22,"name":"yangssem22","age":22}]';
	$(function() {
		$("#test03").click(function() {
			$.ajax({
				url : "test03.do",
				data : {
					txt_json : txt_json
				}, //한개
				dataType : "json",
				success : function(response) {
					$("#result").text(response.result);
				}
			});
			return false;
		});
		$("#test04").click(function() {
			$.ajax({
				url : "test04.do",
				data : {
					txt_json : txt_jsons
				}, //여러개
				dataType : "json",
				success : function(response) {
					$("#result").text(response.result);
				}
			});
			return false;
		});

		///employee03 실습
		let txt_emp = '{"empID": 100,"name": "David","permanent": false,"address": {"street": "BTM 1st Stage","city": "Bangalore","zipcode": 560100},"phoneNumbers": [123456,987654],"role": "Manager","cities": ["Los Angeles","New York"],"properties": {"age": "28 years","salary": "1000 Rs"}}';
		$("#employee03").click(function() {
			$.ajax({
				url : "employee03.do",
				data : {
					txt_json : txt_emp
				}, //한개
				dataType : "json",
				success : function(response) {
					$("#result2").text(response.result);
				}
			});
			return false;
		});
		///employee04 실습
		let txt_emps = '[';
		txt_emps += '{"empID": 101,"name": "David","permanent": false,"address": {"street": "BTM 1st Stage","city": "Bangalore","zipcode": 560100},"phoneNumbers": [123456,987654],"role": "Manager","cities": ["Los Angeles","New York"],"properties": {"age": "28 years","salary": "1000 Rs"}}';
		txt_emps += ',{"empID": 102,"name": "David","permanent": false,"address": {"street": "BTM 1st Stage","city": "Bangalore","zipcode": 560100},"phoneNumbers": [123456,987654],"role": "Manager","cities": ["Los Angeles","New York"],"properties": {"age": "28 years","salary": "1000 Rs"}}';
		txt_emps += ',{"empID": 103,"name": "David","permanent": false,"address": {"street": "BTM 1st Stage","city": "Bangalore","zipcode": 560100},"phoneNumbers": [123456,987654],"role": "Manager","cities": ["Los Angeles","New York"],"properties": {"age": "28 years","salary": "1000 Rs"}}';
		txt_emps += ']';
		$("#employee04").click(function() {
			$.ajax({
				url : "employee04.do",
				data : {
					txt_json : txt_emps
				}, //한개
				dataType : "json",
				success : function(response) {
					$("#result2").text(response.result);
				}
			});
			return false;
		});

	});
</script>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<hr>
	<P>
		<a href="test01.do">vo 객체를 json텍스트로 직렬화</a>
	</P>
	<P>
		<a href="test02.do">vos 컬렉션을 json텍스트로 직렬화</a>
	</P>
	<P>
		<a href="test03.do" id="test03">json텍스트를 비동기로 전송 vo객체로 역직렬화</a>
	</P>
	<P>
		<a href="test04.do" id="test04">json텍스트를 비동기로 전송 vos컬렉션으로 역직렬화</a>
	</P>
	<h2 id="result"></h2>
	<hr>
	<P>
		<a href="employee01.do">employee 객체를 json텍스트로 직렬화</a>
	</P>
	<P>
		<a href="employee02.do">employees 컬렉션을 json텍스트로 직렬화</a>
	</P>
	<P>
		<a href="employee03.do" id="employee03">json텍스트를 비동기로 전송
			employee객체로 역직렬화</a>
	</P>
	<P>
		<a href="employee04.do" id="employee04">json텍스트를 비동기로 전송
			employees컬렉션으로 역직렬화</a>
	</P>
	<hr>
	<h2 id="result2"></h2>
</body>
</html>