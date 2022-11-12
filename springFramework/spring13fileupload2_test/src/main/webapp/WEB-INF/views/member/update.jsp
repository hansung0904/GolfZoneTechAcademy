<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>update.jsp</h1>
	<form action="updateOK.do" method="post" enctype="multipart/form-data">
		<table>
			<tbody>
				<tr>
					<td><label for="num">NUM:</label></td>
					<td>${param.num}<input type="hidden" placeholder="NUM" id="num" name="num"
						value="${param.num}"></td>
				</tr>
				<tr>
					<td><label for="name">NAME:</label></td>
					<td><input type="text" placeholder="NAME" id="name"
						name="name" value="${vo2.name}"></td>
				</tr>
				<tr>
					<td><label for="age">NAME:</label></td>
					<td><input type="number" placeholder="AGE" id="age"
						name="age" value="${vo2.age}"></td>
				</tr>
				<tr>
					<td><label for="tel">IMAGE:</label></td>
					<td><input type="file" name="multipartFile">
					<input type="hidden" name="imgName"
						value="${vo2.imgName}"></td>
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