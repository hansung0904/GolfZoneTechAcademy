<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h3>삭제</h3>
<table>
	<tbody>
		<tr>
			<td><label for="num">NUM:</label></td>
			<td colspan="2">${param.num}</td>
		</tr>
		<tr>
			<td colspan="2">정말 삭제하시겠습니까?</td>
			<td><a href="deleteOK.do?num=${param.num}">삭제완료</a></td>
		</tr>
	</tbody>
</table>

