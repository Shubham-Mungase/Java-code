package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo1 {
	
	
	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st = null;
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
			st = cn.prepareStatement("UPDATE EMP SET EMPNAME=?,SALARY=?,DEPTID=? WHERE EMPID=?");
			st.setInt(4, vno);
			st.setString(1, vname);
			st.setInt(2, vsal);
			st.setInt(3, vdno);
			int res=st.executeUpdate();
			if(res==1) {
				System.out.println("Record is Updated Sucessfuly");
			}
			else 
			{
				System.out.println("Record not Updated");
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
