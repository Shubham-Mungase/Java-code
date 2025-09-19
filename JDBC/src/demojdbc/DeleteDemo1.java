package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo1 {
	
	
	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st = null;
		Scanner sc=new Scanner(System.in);
		int vno,vsal,vdno;
		String vname;
		try {
			System.out.println("Enter Emp No :");
			vno=sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st = cn.prepareStatement("DELETE FROM EMP WHERE EMPID=?");
			st.setInt(1, vno);
			int res=st.executeUpdate();
			if(res==1) {
				System.out.println("Record is DELETED Sucessfuly");
			}
			else 
			{
				System.out.println("Record not DELETED");
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
