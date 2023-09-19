<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><a href="/springmvc/paramtest?data=first&info=10">Export Parameter</a></h3>
	<form action="/springmvc/paramtest" method="post">
		ID:<input type="text" name="id">
		PW:<input type="password" name="pass">
		<input type="submit" value="Export Paramater from Spring">
	</form>
	<form action="/springmvc/paramtest2" method="post">
		ID:<input type="text" name="id">
		PW:<input type="password" name="pass">
		<input type="submit" value="Export Paramater from Spring">
	</form>
	
</body>
</html>