<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="nav">
	<ul>
		<li><a href="home.do">홈</a></li>
		<li><a href="b_insert.do">글쓰기</a></li>
		<li><a href="b_selectAll.do">글목록</a></li>
	</ul>
</div>
<br><br>
<hr>
	<a href="login.do">로그인</a>
	${user_id}
	<a href="logout.do">로그아웃</a>
	<a href="m_insert.do">회원가입</a>