<%@page import="java.sql.*"%>
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
		while(rs.next())
		{
			out.println("<br>Emp Id ="+rs.getInt(1));
			out.println("<br>Emp Name ="+rs.getString(2));
			out.print("<br>Emp Salary ="+rs.getInt(3));
			out.println("-".repeat(20));
		}
	}
	catch(Exception e)
	{
		out.println("exp="+e);
	}
	finally{
		st.close()
		;
		cn.close();
		rs.close();
	}

%>
</body>
</html>