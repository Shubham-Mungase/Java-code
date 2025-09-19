package demojdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteDemo2 {

	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ResultSet rs = null;
		int veno, vsal, edeptid;
		String vname;
		try {
			System.out.println("Enter Emp No which you want to update the Record :");
		
			veno = Integer.parseInt(br.readLine());
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st = cn.prepareStatement("SELECT * FROM EMP WHERE EMPID=" + veno, ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery();
			if(rs.next()) {
			rs.deleteRow();
			System.out.println("Record Deleted");
			}
			else 
				System.out.println("Record not present");
		} catch (Exception e) {
			System.out.println("Exp=" + e);
			try {
				br.close();
				cn.close();
				rs.close();
				st.close();
			} catch (Exception e1) {
				System.out.println("Exp=" + e1);
			}
		}

	}
}
