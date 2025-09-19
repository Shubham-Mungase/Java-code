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
		String vname="",vpass="";
		vname=request.getParameter("txname");
		vpass=request.getParameter("txpass");
		if(vname==null)
			vname="";
		if(vpass==null)
			vpass="";
		if(vname!="" && vpass!="")
		{
			if(vname.equals("shubham") && vpass.equals("123"))
			{
				%>
				<script type="text/javascript">
				alert("Login Sucessfully");
				</script>
				<%
				response.sendRedirect("./Convert1.jsp");
				response.setHeader("h1","This is Header demo setting");
				response.setStatus(200);
			}
		}
		else
		{
			%>
			<script type="text/javascript">
			alert("Login Not Sucessfull");
			</script>
			<%
			
		}
	%>
	<form action="./Login1.jsp">
		User Name: <input type="text" name="txname" value="<%=vname%>"><br>
		PassWord :<input type="password" name="txpass" value="<%=vpass%>"><br>
		<button type="submit">Login</button>
	</form>
	
	
	
	
	
</body>
</html>