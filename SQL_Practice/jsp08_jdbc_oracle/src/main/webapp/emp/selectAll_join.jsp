<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<th>emp_id</th>
			<th>emp_name</th>
			<th>salary</th>
			<th>dept_name</th>
		</tr>
		<c:forEach var="vo" items="${vos}">
			<tr>
				<td>${vo.emp_id}</td>
				<td>${vo.emp_name}</td>
				<td>${vo.salary}</td>
				<td>${vo.dept_name}</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>