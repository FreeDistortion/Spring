<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>7단 출력</h2>	
	<c:forEach var="i" begin="1" end="9" step="1">
		<p>7 * ${i } = ${7*i } 
	</c:forEach>

	<h2>print 1 to 10</h2>
	<hr>
	<c:forEach var="i" begin="1" end="10" step="1" varStatus="mystatus">
		<h2>${i }, index=${mystatus.index }, first=>${mystatus.first }, last=>${mystatus.last }, begin=>${mystatus.begin }, end=>${mystatus.end }, step=>${mystatus.step }</h2>
	</c:forEach>


</body>
</html>