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
	<form action="updateOK.do" method="post">
		<table>
			<tbody>
				<tr>
					<td><label for="num">NUM:</label></td>
					<td>${param.num}<input type="hidden" placeholder="NUM" id="num" name="num"
						value="${param.num}"></td>
				</tr>
				<tr>
					<td><label for="id">ID:</label></td>
					<td>${vo2.id}<input type="hidden" placeholder="ID" id="id" name="id"
						value="${vo2.id}"></td>
				</tr>
				<tr>
					<td><label for="pw">PW:</label></td>
					<td><input type="password" placeholder="PW" id="pw" name="pw"
						value="${vo2.pw}"></td>
				</tr>
				<tr>
					<td><label for="name">NAME:</label></td>
					<td><input type="text" placeholder="NAME" id="name"
						name="name" value="${vo2.name}"></td>
				</tr>
				<tr>
					<td><label for="tel">TEL:</label></td>
					<td><input type="text" placeholder="TEL" id="tel" name="tel"
						value="${vo2.tel}"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="수정완료"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>