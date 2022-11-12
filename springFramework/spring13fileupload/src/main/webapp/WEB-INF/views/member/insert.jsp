<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>insert.jsp</h1>
	<form action="insertOK.do" method="post" enctype="multipart/form-data">
		<input type="text" name="name" value="kim"><br>
		<input type="number" name="age" value="33"><br>
		<input type="file" name="multipartFile"><br>
		<input type="submit">
	</form>
	<hr>
	<form action="insertOK2.do" method="post" enctype="multipart/form-data">
		<input type="text" name="name" value="kim"><br>
		<input type="number" name="age" value="33"><br>
		<input type="file" name="multipartFile"><br>
		<input type="submit">
	</form>
</body>
</html>