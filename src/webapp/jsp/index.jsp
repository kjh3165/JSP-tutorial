<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="usr/common/header.jspf" %>

<h1>홈 화면</h1>
<div>
    <a href="/usr/article/list">게시글 목록</a>
    <a href="/usr/member/login">로그인</a>
    <a href="/usr/member/join">회원가입</a>
    <a href="/usr/member/me">내정보</a>
</div>

<%@ include file="usr/common/footer.jspf" %>