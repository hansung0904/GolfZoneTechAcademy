<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>부서목록</title>
</head>
<body>
<h1>부서목록</h1>
<table>
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
			<td>${employee_id}</td>
			<td>${first_name}</td>
			<td>${last_name}</td>
			<td>${salary}</td>
			<td>${job_id}</td>
			<td>${department_id}</td>
		</tr>
	</c:forEach>
</table>

temp_emp

</body>
</html>