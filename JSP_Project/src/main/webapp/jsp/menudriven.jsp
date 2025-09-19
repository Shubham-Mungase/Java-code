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

 a = Integer.parseInt(request.getParameter("num1")) ;
 b = Integer.parseInt(request.getParameter("num2"));
String str = request.getParameter("ch");

if(str.equalsIgnoreCase("add"))
{
	c = a+b;
	out.print("Addition="+c);
}
else if(str.equalsIgnoreCase("sub"))
{
	c = a-b;
	out.print("Subtraction="+c);
}
else if(str.equalsIgnoreCase("mul"))
{
	c = a*b;
	out.print("Multipication="+c);
}
else if(str.equalsIgnoreCase("div"))
{
	c = a/b;
	out.print("Division="+c);
}





%>

</body>
</html>