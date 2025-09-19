package demojdbc;

//enter dept name and display name of total salary working in that dept
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDemo8 {
	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st = cn.prepareStatement(
					"SELECT deptname , sum(salary) as Total_Sal FROM EMP,dept WHERE emp.deptid=dept.deptid group by deptname");
			rs = st.executeQuery();
			System.out.println("Dept Name \t\t Total Salary");
			while (rs.next()) {

				System.out.println(rs.getString("deptname") + "\t\t" + rs.getInt("Total_Sal"));
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
