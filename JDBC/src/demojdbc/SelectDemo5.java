package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDemo5 {
	public static void main(String[] args) {
		Connection cn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String vname;
		
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/suhani";
			cn=DriverManager.getConnection(url,"root","7777");
			st=cn.prepareStatement("SELECT empname,deptname FROM EMP,dept WHERE emp.deptid=dept.deptid");
			rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println("Emp Name ="+rs.getString(1));
				System.out.println("Dept Name="+rs.getString(2));
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
