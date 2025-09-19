<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
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

ArrayList <String> list1 = new ArrayList();
String str[] = request.getParameterValues("ls");
if(str!=null)
{
	for(String v: str)
	{
		out.print("<br>"+v);
	}
	
	Collections.addAll(list1, str);
}
String color [] = {"Red","blue","Green","yellow"};



%>


<form action="./list4.jsp" method="post">

<select name="ls" multiple>

<%
for(String v: color)
{
	if(list1.contains(v))
	{
		%>
		<option value="<%=v %>" selected ><%=v %></option>
		<% 
	}
	else
	{
		%>
		<option value<%= v %>  ><%=v%></option>
		<% 
	}
}
%>
</select>


<button type="submit" value="submit" > Submit </button>
</form>

</body>
</html>