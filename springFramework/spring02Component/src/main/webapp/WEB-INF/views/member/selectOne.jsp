<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>selectOne.jsp</h1>
	<table>
		<tbody>
			<tr>
				<td><label for="num">NUM:</label></td>
				<td colspan="2">${param.num}</td>
			</tr>
			<tr>
				<td><label>ID:</label></td>
				<td colspan="2">${vo2.id}</td>
			</tr>
			<tr>
				<td><label>PW:</label></td>
				<td colspan="2">${vo2.pw}</td>
			</tr>
			<tr>
				<td><label>NAME:</label></td>
				<td colspan="2">${vo2.name}</td>
			</tr>
			<tr>
				<td><label>TEL:</label></td>
				<td colspan="2">${vo2.tel}</td>
			</tr>
			<tr>
				<td colspan="3">
					<a href="update.do?num=${param.num}">회원수정</a>
					<a href="delete.do?num=${param.num}">회원삭제</a>
				</td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>