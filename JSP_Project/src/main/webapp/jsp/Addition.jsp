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
	String str;
	int a, b, c;
	str = request.getParameter("txfno");
	if(str==null)
		a=0;
	else
		a=Integer.parseInt(str);
	str=request.getParameter("txsno");
	if(str==null)
		b=0;
	else
		b=Integer.parseInt(str);
	c = a + b;
	out.println("Addition=" + c);
	%>
	<form action="../jsp/Addition.jsp" method="post">
		Enter First no<input type="text" name="txfno" value="<%=a%>"><br>
		Enter Second no<input type="text" name="txsno" value="<%=b%>"><br> 
		Addition=<input type="text" value="<%=c%>">
		<input type="submit" name="but" value="Add">
	</form>
	
</body>
</html>