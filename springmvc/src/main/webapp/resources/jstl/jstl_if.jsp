<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 
	외부에서 제공되는 library를 JSP에서 사용하기 위한 지시자
	Spring, tiles, JSTL, ... tags
 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		JSTL(Jsp(Java Server Page) Standard Tag Library)
		 - 기본 java code를 tag로 사용할 수 있도록 지원.
		 - EL과 같이 사용.
		 - JSTL 사용을 위해서 tag library 추가(taglib 지시자).
		 - <c:XXX> tag 이용해서 작업. 
 	--%>
	<h3>c:if의 사용 - java if command(true인 경우만 check)</h3>
	<span>1. 전송된 parameter name check(name이 홍걸동이면 "홍길동님 환영합니다." 메시지
		출력.)</span>
	<h3>${param.name }</h3>
	<h3>${param.addr}</h3>
	<c:if test="${param.name=='홍길동' }">
		<h4>${param.name }님 환영합니다.</h4>
	</c:if>
</body>
</html>