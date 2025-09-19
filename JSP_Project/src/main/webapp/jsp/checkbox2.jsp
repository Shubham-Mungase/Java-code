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
String str[] = request.getParameterValues("ch");

if (str == null )
{
	str = new String[0]; 
}

for(String v:str){
	out.print("<br>course="+v+"course");
}

ArrayList<String> list1 = new ArrayList<String>();
Collections.addAll(list1,str);
out.println(list1);
String courses [] = {"c ","cpp","java","python"};

%>

<form method="post" action="./checkbox2.jsp">

<label>Select Courses</label><br>
<%
for (String v:courses)
{
	out.println(v);
	if(list1.contains(v.trim()))
	{
		out.println("if="+v);
		
		%>
		<input type="checkbox" name="ch" value="<%= v%>" checked > <%=v %><br>
		<% 
	}
	else
	{
		%>
		<input type="checkbox" name="ch" value="<%= v%> "  ><%=v %><br>
		<% 
	}
}
%>
<button type="submit" name="but" value="submit" >submit </button>

</form>

</body>
</html>