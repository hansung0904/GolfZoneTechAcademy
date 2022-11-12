<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>insert.jsp</h1>
	

	<spring:message code="user.info" arguments="admin,hi1111,양샘,010"></spring:message>
	<hr>
	<spring:message code="msg.error"></spring:message>

	<hr>
	<spring:message code="input.minlength" arguments="아이디,8"></spring:message>

</body>
</html>