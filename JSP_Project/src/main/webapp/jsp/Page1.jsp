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
		String str1=request.getParameter("p1");
		out.println("String 1 ="+str1);
		String str2=request.getParameter("p2");
		out.println("String 2 ="+str2);
	%>
</body>
</html>