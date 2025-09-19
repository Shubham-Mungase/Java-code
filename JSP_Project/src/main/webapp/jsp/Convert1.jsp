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
	if(str==null)
		str="";
	String rd = request.getParameter("rd");
	if(rd==null)
	{
		rd="";
	}
	if (rd.equalsIgnoreCase("upper")) {
		str = str.toUpperCase();
		out.print(str);
	} else if (rd.equalsIgnoreCase("lower")) {
		str = str.toLowerCase();
		out.print(str);
	}
	%>
	<form action="../jsp/Convert1.jsp" method="get">
		Enter String :<input type="text" name="tx" value="<% out.println(str); %>">
		<br>
	<%
	if(rd.equalsIgnoreCase("upper"))
	{
		%>
		<input type="radio" name="rd" value="Upper" checked="checked">Upper
		<input type="radio" name="rd" value="Lower">Lower
		<%
	}
	else if(rd.equalsIgnoreCase("lower"))
	{
		%>
			
			<input type="radio" name="rd" value="Upper">Upper
			<input type="radio" name="rd" value="Lower" checked="checked">Lower
		
	<%	
	}
	else{
		%>
			
			<input type="radio" name="rd" value="Upper">Upper
			<input type="radio" name="rd" value="Lower">Lower
		
		<%
	}
	%>
		<input type="submit" name="but" Value="Submit">
	</form>

</body>
</html>