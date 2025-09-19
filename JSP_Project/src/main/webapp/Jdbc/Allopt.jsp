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
	PreparedStatement st=null;
	int vaccno=0,vamount=0;
	String vcname="";
	String but=request.getParameter("but");
	if(but==null)
		but="";
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/suhani";
		cn=DriverManager.getConnection(url,"root","7777");
		 
		
		if(but.equalsIgnoreCase("save"))
		{
			vaccno=Integer.parseInt(request.getParameter("accno"));
			vcname=request.getParameter("txname");
			vamount=Integer.parseInt(request.getParameter("amount"));
			st=cn.prepareStatement("insert into customer values(?,?,?)");
			st.setInt(1,vaccno);
			st.setString(2,vcname);
			st.setInt(3,vamount);
			st.executeUpdate();
			%>
			<script type="text/javascript">
			alert("Record Save");
			</script>
			<%
			
		}
		else if(but.equalsIgnoreCase("update"))
		{
			vaccno=Integer.parseInt(request.getParameter("accno"));
			vcname=request.getParameter("txname");
			vamount=Integer.parseInt(request.getParameter("amount"));
			st=cn.prepareStatement("update customer set custname=?,amount=? where accno=?)");
			st.setInt(3,vaccno);
			st.setString(1,vcname);
			st.setInt(2,vamount);
			st.executeUpdate();
			%>
			<script type="text/javascript">
			alert("Record update");
			</script>
			<%
			
		}
		else if(but.equalsIgnoreCase("delete"))
		{
			vaccno=Integer.parseInt(request.getParameter("accno"));
			st=cn.prepareStatement("delete from cutomer where accno="+vaccno);
			st.executeUpdate();
			%>
			<script type="text/javascript">
			alert("Record deleted");
			</script>
			<%
			
		}
		else if(but.equalsIgnoreCase("search"))
		{
			vaccno=Integer.parseInt(request.getParameter("accno"));
			st=cn.prepareStatement("select * from cutomer where accno="+vaccno);
			rs=st.executeQuery();
			if(rs.next())
			{
				out.println("<br>Account no ="+rs.getInt(1));
				out.println("<br>Customer Name ="+rs.getString(2));
				out.print("<br>Amount ="+rs.getInt(3));
				out.println("-".repeat(20));
			}
			else{
				%>
				<script type="text/javascript">
				alert("Record not present");
				</script>
				<%
			}
		}
			
	}
	catch(Exception e)
	{
		out.print("Exp"+e);
	}
	%>
</body>
</html>