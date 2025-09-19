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
String str[] = request.getParameterValues("ck");

if(str.length == 0)
{
	str = new String[2];
}
else
{

for(String V:str)
{
	out.print(V);
	out.print("&nbsp;");
}
}
%>

<form action="./checkbox.jsp" method="post" >
<label>Courses</label>
<br>
<input type="checkbox" value="C" >C <br>
<input name="ck" type="checkbox" value="cpp" >Cpp <br>
<input name="ck"  type="checkbox" value="css" >css <br>
<input name="ck"  type="checkbox" value="java" >java <br>
<input  name="ck"  type="checkbox" value="php" >php <br>
<input name="ck"  type="checkbox" value="python" >python <br>

<button type="submit" value="submit" name="but" >submit</button>
</form>


</body>
</html>