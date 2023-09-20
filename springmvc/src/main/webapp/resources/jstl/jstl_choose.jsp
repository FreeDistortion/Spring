<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>c:choose가 if~else를 표현할 수 있다.</h2>
<h3>age < 20 : XXX님, 청소년입니다. else: XXX님, 성인입니다.</h3>
if, else if comnmand -> c:when
else -> c:otherwise
<c:choose>
	<c:when test="${param.age<20 }">
		<h3>${param.name }님, 청소년입니다.</h3>
	</c:when>
	<c:otherwise>
		<h3>${param.name }님, 성인입니다.</h3>
	</c:otherwise>
</c:choose>

<h2>Controller가 공유해준 data check(공유객체가 null인지)</h2>
<hr>
<c:choose>
	<c:when test="${user==null }">
		<h3>user is null.</h3>
	</c:when>
	<c:otherwise>
		<h3>user is not null.</h3>
	</c:otherwise>
</c:choose>
<hr>

<c:choose>
	<c:when test="${param.grade=='A'||param.grade=='a'}">
		<h3>A등급</h3>
	</c:when>
	<c:when test="${param.grade=='B'||param.grade=='b'}">
		<h3>B등급</h3>
	</c:when>
	<c:when test="${param.grade=='C'||param.grade=='c'}">
		<h3>C등급</h3>
	</c:when>
	<c:otherwise>
		<h3>기타</h3>
	</c:otherwise>
	
</c:choose>

</body>
</html>