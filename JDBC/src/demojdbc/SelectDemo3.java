package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDemo3 {
	public static void main(String[] args) {
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		String vname;
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			vname=sc.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/suhani";
			cn=DriverManager.getConnection(url,"root","7777");
			st=cn.createStatement();
			rs=st.executeQuery("SELECT * FROM EMP WHERE EMPNAME='"+vname+"'");
			if(rs.next())
			{
				System.out.println("Emp id ="+rs.getInt(1));
				System.out.println("Emp Name ="+rs.getString(2));
				System.out.println("Emp Salary="+rs.getInt(3));
				System.out.println("-".repeat(15));
			}
			else
			{
				System.out.println("Record is not present");
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
