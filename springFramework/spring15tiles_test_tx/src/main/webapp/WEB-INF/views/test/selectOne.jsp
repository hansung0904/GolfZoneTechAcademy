<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>selectOne.jsp</h1>
<table>
	<tbody>
		<tr>
			<td><label for="num">NUM:</label></td>
			<td colspan="2">${param.num}</td>
		</tr>
		<tr>
			<td><label>NAME:</label></td>
			<td colspan="2">${vo2.name}</td>
		</tr>
		<tr>
			<td><label>AGE:</label></td>
			<td colspan="2">${vo2.age}</td>
		</tr>
		<tr>
			<td><label>IMAGE:</label></td>
			<td colspan="2"><img alt="${param.imgName}"
				src="resources/upload/${vo2.imgName}"></td>
		</tr>
		<tr>
			<td colspan="3"><a href="update.do?num=${param.num}">회원수정</a> <a
				href="delete.do?num=${param.num}">회원삭제</a></td>
		</tr>
	</tbody>
</table>

