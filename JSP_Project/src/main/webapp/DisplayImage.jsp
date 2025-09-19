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

HttpSession session1=request.getSession();
String name=""+session1.getAttribute("name");
out.println(session1.getAttribute("filename"));
String filename="./images/"+session1.getAttribute("filename");

%>
<label>Name</label><label><%=name%></label>
<img  style="wisth:70% ; height:100px"  src="<%=filename%>"/>

<form action="DisplayImage" method="POST" >
<table align="center">
<tr><td>Id</td><td><input type="text" name="txid"></td></tr>

<tr><td>Submit</td><td><input type="Submit" name="but" value="show"></td></tr>
</table>

</form>
</body>
</html>