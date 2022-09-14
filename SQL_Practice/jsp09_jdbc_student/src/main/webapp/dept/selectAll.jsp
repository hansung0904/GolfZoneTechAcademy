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
<table border="1">
    <tr>
        <th>department_id</th>
        <th>department_name</th>
        <th>manager_id</th>
        <th>location_id</th>
    </tr>
    <c:forEach var="vo" items="${vos}">
        <tr>
            <td>${vo.department_id}</td>
            <td>${vo.department_name}</td>
            <td>${vo.manager_id}</td>
            <td>${vo.location_id}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>