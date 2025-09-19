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
	String str = request.getParameter("tx");
	String rd = request.getParameter("rd");
	if (rd.equalsIgnoreCase("upper")) {
		str = str.toUpperCase();
		out.print(str);
	} else if (rd.equalsIgnoreCase("lower")) {
		str = str.toLowerCase();
		out.print(str);
	}
	%>
</body>
</html>