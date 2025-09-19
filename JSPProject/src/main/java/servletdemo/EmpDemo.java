package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpDemo
 */
@WebServlet("/EmpDemo")
public class EmpDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement st=null;
	ResultSet rs=null;
	Connection cn=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpDemo() {
        super();
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db4";
			cn = DriverManager.getConnection(url, "root", "7777");
		} catch (Exception e) {

			e.printStackTrace();
		}
		
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pout=response.getWriter();
		int empid=Integer.parseInt(request.getParameter("empid"));
		String empname=request.getParameter("empname");
		int empsal=Integer.parseInt(request.getParameter("empsal"));
		String gender=request.getParameter("empgend");
		String but=request.getParameter("but");
//		pout.println(empid);
//		pout.println(empname);
//		pout.println(empsal);
//		pout.println(gender);
//		pout.println(but);
		
		
		try {
		if(but.equalsIgnoreCase("insert"))
		{
			
			st =cn.prepareStatement("INSERT INTO EMP VALUES(?,?,?,?)");
			st.setInt(1, empid);
			st.setString(2, empname);
			st.setInt(3, empsal);
			st.setString(4, gender);
			int res=st.executeUpdate();
			if(res==1)
			{
				pout.println("<script>alert(\"Record Inserted Successfully...!\")</script>;");
			}
			else
			{
				pout.println("alert(\"Record Not Inserted ..!\");");
			}
		}
		else if(but.equalsIgnoreCase("delete"))
		{
			st=cn.prepareStatement("DELETE FROM EMP WHERE EMPID=?");
			st.setInt(1, empid);
			int res=st.executeUpdate();
			if(res==1)
			{
				pout.println("Record Deleted Successfully...");
			}
			else
			{
				pout.println("Record Not Found For Delete..");
			}
		}
		else if(but.equalsIgnoreCase("update"))
		{
				st=cn.prepareStatement("UPDATE EMP SET EMPNAME=?,SALARY=?,GENDER=? WHERE EMPID=?");
					st.setString(1, empname);
					st.setInt(2, empsal);
					st.setString(3, gender);
					st.setInt(4, empid);
					int res=st.executeUpdate();
					if(res==1)
					{
						pout.println("Record Updated Successfully...");
					}
					else
					{
						pout.println("Record Not Found For Update..");
					}
		}
		else if(but.equalsIgnoreCase("search"))	
		{
			st=cn.prepareStatement("SELECT * FROM EMP WHERE EMPID=?");
			st.setInt(1,empid);
			rs=st.executeQuery();
			if(rs.next())
			{
				pout.println("Emp Id="+rs.getInt(1));
				pout.println("Emp Name="+rs.getString(2));
				pout.println("Emp Salary="+rs.getInt(3));
				pout.println("Emp Gender="+rs.getString(4));
			}
			else
			{
				pout.println("Recond not present");
			}
		}
		}catch(Exception e)
		{
			pout.println("Exp="+e);
		}
		
		
	}

}
