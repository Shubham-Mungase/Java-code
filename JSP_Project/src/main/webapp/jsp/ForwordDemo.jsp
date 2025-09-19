<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Wel come to first page</h1>
<jsp:forward page="./Page1.jsp">
<jsp:param value="Shubham" name="p1"/>
<jsp:param value="Full stack" name="p2"/>
</jsp:forward>
</body>
</html>