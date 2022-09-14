<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>selectAll</h1>
	<table border="1">
		<tr>
			<th>employee_id</th>
			<th>first_name</th>
			<th>last_name</th>
			<th>salary</th>
			<th>job_id</th>
			<th>department_id</th>
		</tr>
		<c:forEach var="vo" items="${vos}">
			<tr>
				<td>${vo.employee_id}</td>
				<td>${vo.first_name}</td>
				<td>${vo.last_name}</td>
				<td>${vo.salary}</td>
				<td>${vo.job_id}</td>
				<td>${vo.department_id}</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>