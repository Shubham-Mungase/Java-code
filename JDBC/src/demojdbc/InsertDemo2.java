package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo2 {
	
	
	public static void main(String[] args) {
		Connection cn = null;
		Statement st = null;
		Scanner sc=new Scanner(System.in);
		int vno,vsal,vdno;
		String vname;
		try {
			System.out.println("Enter Emp No :");
			vno=sc.nextInt();
			System.out.println("Enter Emp Name :");
			vname=sc.next();
			System.out.println("Enter Emp Salary :");
			vsal=sc.nextInt();
			System.out.println("Enter Dept No :");
			vdno=sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st=cn.createStatement();
			int res=st.executeUpdate("INSERT INTO EMP VALUES("+vno+",'"+vname+"',"+vsal+","+vdno+")");
			if(res==1) {
				System.out.println("Record is inserted Sucessfuly");
			}
			else 
			{
				System.out.println("Record not inseted");
			}

		} catch (Exception e) {
			System.out.println("Exp =" + e);
		} finally {
			try {
				st.close();
				cn.close();
			} catch (Exception e) {
				System.out.println("Exp=" + e);
			}
		}

	}

}
