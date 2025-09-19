<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Connection cn=null;
ResultSet rs=null;
Statement st=null;
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/suhani";
	cn=DriverManager.getConnection(url,"root","7777");
	st=cn.createStatement();
	rs=st.executeQuery("SELECT * FROM EMP");
	%>
	<table border="2">
	<tr>
		<th>EmpID</th>
		<th>EmpName</th>
		<th>Salary</th>
	</tr>
	<%
	while(rs.next())
	{
		out.print("<tr>");
		out.println("<td>"+rs.getInt(1)+"</td>");
		out.println("<td>"+rs.getString(2)+"</td>");
		out.print("<td>"+rs.getInt(3)+"</td>");
		out.println("</tr>");
	}
	%>
	</table>
	<%
}
catch(Exception e)
{
	out.print("exp="+e);
}
finally{
	rs.close();
	st.close();
	cn.close();
}
%>

</body>
</html>