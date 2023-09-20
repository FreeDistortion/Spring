<%@page import="test.TestDTO"%>
<%@page import="java.util.ArrayList"%>
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
	<h1>Collection에 저장된 data access</h1>
	<h2>JSP가 하는 일은 controller에서 공유한 attribute를 꺼내서 출력하는 것</h2>
	<h3>1. Array</h3>
	<%
	String[] arr = { "java", "servlet", "jsp", "spring" };
	%>
	<c:forEach var="data" items="<%=arr%>">
		<h3>${data }</h3>
	</c:forEach>


	<h3>2. ArrayList(shared by controller)</h3>
	<%
	ArrayList<String> list = new ArrayList<String>();
	list.add("hadoop");
	list.add("spark");
	list.add("mongoDB");
	list.add("pig");
	request.setAttribute("list", list);
	%>
	<c:forEach var="data" items="${list }" varStatus="status">
		<h3>${data },current=>${status.current },index=>${status. index}</h3>
	</c:forEach>

	<h3>3. ArrayList DTO</h3>
	<%
	ArrayList<TestDTO> userlist = new ArrayList<TestDTO>();
	userlist.add(new TestDTO("kim", "1234"));
	userlist.add(new TestDTO("park", "1234"));
	userlist.add(new TestDTO("lee", "1234"));
	userlist.add(new TestDTO("hong", "1234"));
	//controller에서 공유된 data라 가정
	request.setAttribute("userlist", userlist);
	%>
	<!-- JSP에서 사용 -->
	<hr><hr><hr><hr>
	<%
	ArrayList<TestDTO> jspUserList = (ArrayList<TestDTO>) request.getAttribute("userlist");
	for (int i = 0; i < jspUserList.size(); i++) {
		TestDTO user = jspUserList.get(i);
	%>
	<h3><%=user.getId()%>,<%=user.getPass()%></h3>
	<%
	}
	%>
	<hr><hr><hr><hr>
	<h2>JSTL로 변경</h2>
	<hr><hr><hr><hr>
	<c:forEach var="user" items="${userlist }">
		<h3>${user.getId()}, ${user.pass }</h3>
		
	</c:forEach>

</body>
</html>