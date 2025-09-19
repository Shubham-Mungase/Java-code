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
		int a,b,c;
	a=Integer.parseInt(request.getParameter("txfno"));
	b=Integer.parseInt(request.getParameter("txsno"));
	c=a+b;
	out.print("Addition="+c);
	%>
</body>
</html>