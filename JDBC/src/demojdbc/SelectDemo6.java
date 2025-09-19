package demojdbc;
//enter dept name and display name of the employee working in that dept
//total salary
//count the no of emp in that dept
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDemo6 {
	public static void main(String[] args) {
		Connection cn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String vdname;
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Department name :");
			vdname=sc.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/suhani";
			cn=DriverManager.getConnection(url,"root","7777");
			st=cn.prepareStatement("SELECT empname FROM EMP,dept WHERE emp.deptid=dept.deptid and deptname=?");
			st.setString(1,vdname);
			rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println("Emp Name ="+rs.getString(1));
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


