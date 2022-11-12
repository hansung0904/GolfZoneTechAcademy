<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>selectAll.jsp</h1>

<form action="searchList.do" method="get">
	<table>
		<tr>
			<td><select name="searchKey" id="searchKey">
					<option value="name">name</option>
					<option value="age">age</option>
			</select></td>
			<td><input type="text" name="searchWord" id="searchWord"
				value="ki"></td>
			<td><input type="submit"></td>
		</tr>
	</table>
</form>

<table>
	<thead>
		<tr>
			<th>num</th>
			<th>name</th>
			<th>age</th>
			<th>image</th>
		</tr>
	</thead>
	<tbody>

		<c:forEach var="vo" items="${vos}">
			<tr>
				<td><a href="selectOne.do?num=${vo.num}">${vo.num}</a></td>
				<td>${vo.name}</td>
				<td>${vo.age}</td>
				<td><img alt="${vo.imgName}"
					src="resources/upload/thumb_${vo.imgName}"></td>
			</tr>
		</c:forEach>


	</tbody>
	<tfoot>
		<tr>
			<td colspan="6">1 2 3 4 5</td>
		</tr>
	</tfoot>
</table>
