package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo1 {
	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st = null;
		

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st = cn.prepareStatement("INSERT INTO EMP VALUES(8,'Navanath',100000,5)");
			int res=st.executeUpdate();
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
