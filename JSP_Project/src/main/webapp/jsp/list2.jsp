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
String str = request.getParameter("ch");
if(str!=null)
{
	out.print("selected values="+str);
}
else
	str = "select color";

%>


<form action="./list2.jsp" method="get" >

<select name="ch" >
<option><%=str %></option>
<option>red</option>
<option>green</option>
<option>yellow</option>
<option>pink</option>

</select>
<button type="submit" value="submit" >submit</button>
</form>

</body>
</html>