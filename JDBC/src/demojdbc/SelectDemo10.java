package demojdbc;

//display info of emp of particular row using absolute function
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDemo10 {
	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st = cn.prepareStatement("SELECT * FROM EMP",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery();
			if(rs.absolute(3)) {
				System.out.println("Emp id ="+rs.getInt(1));
				System.out.println("Emp name ="+rs.getString(2));
				System.out.println("Emp Salary ="+rs.getInt(3));
				System.out.println("Dept id="+rs.getInt(4));
				System.out.println("_".repeat(20));
			}
			else 
			{
				System.out.println("Record not present");
			}

		} catch (Exception e) {
			System.out.println("Exp =" + e);
		} finally {
			try {
				rs.close();
				st.close();
				cn.close();
			} catch (Exception e) {
				System.out.println("Exp=" + e);
			}
		}

	}

}
