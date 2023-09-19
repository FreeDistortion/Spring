<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	System.out.println("^^^^^^^^^^^^^^^^^^");
	%>
	${postdto}
	<hr>
	<h2>id:${postdto.userId}</h2>
	<h2>pw:${postdto.passwd}</h2>
</body>
</html>