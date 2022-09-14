<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>부서추가</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>
	$(function(){
		console.log("ready....");
		
// 		let obj_dept_job_id = {
// 				dept_ids:[10,20,30,40,50,60],
// 				job_ids:[
// 					'FI_MGR',
// 					'FI_ACCOUNT',
// 					'AC_MGR']};
		
		//json_dept_id.do
// 		select department_id from temp_dept;
		
		$.get("json_emp_id.do",function(responseText){
// 			console.log(".get : ",responseText);
			let emp_ids = JSON.parse(responseText);//10~270
			console.log(".get : ",emp_ids);
			emp_ids.forEach(function(emp_id){
				$("#manager_id").append(
					'<option value="'+emp_id+'">'+emp_id+'</option>');
			});
			
		});
		
		$.get("json_loc_id.do",function(responseText){
// 			console.log(".get : ",responseText);
			let loc_ids = JSON.parse(responseText);//10~270
			console.log(".get : ",loc_ids);
			
			loc_ids.forEach(function(loc_id){
				$("#location_id").append(
					'<option value="'+loc_id+'">'+loc_id+'</option>');
			});
			
		});
		
		
		
		
	});
</script>
</head>
<body>
	<h1>부서추가</h1>
	<form action="d_insertOK.do" method="post">
		<label for="department_name">department_name:</label>
		<input type="text" placeholder="department_name" id="department_name"
			name="department_name" value="영업부">
		<br> 
		
		<label for="manager_id">manager_id:</label>
		<select id="manager_id" name="manager_id">
		</select><br>
		<label for="location_id">location_id:</label>
		<select id="location_id" name="location_id">
		</select><br>
		<input type="submit" value="부서추가">
	</form>

</body>
</html>