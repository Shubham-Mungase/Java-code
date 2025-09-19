package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo2 {
	public static void main(String[] args) {
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/suhani";
			cn=DriverManager.getConnection(url,"root","7777");
			st=cn.createStatement();
			rs=st.executeQuery("SELECT * FROM EMP ORDER BY EMPNAME");
			while(rs.next())
			{
				System.out.println("Emp id ="+rs.getInt(1));
				System.out.println("Emp Name ="+rs.getString(2));
				System.out.println("Emp Salary="+rs.getInt(3));
				System.out.println("-".repeat(15));
			}
		}catch(Exception e)
		{
			System.out.println("Exp ="+e);
		}
		finally
		{
			try
			{
				rs.close();
				st.close();
				cn.close();
			}
			catch(Exception e)
			{
				System.out.println("Exp="+e);
			}
		}
		
	}

}
