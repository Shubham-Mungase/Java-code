package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TransactionDemo1 {
	public static void main(String[] args) throws Exception {

		int veno, vsal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp no which salary you want to Update :");
		veno = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/suhani";
		Connection cn = DriverManager.getConnection(url, "root", "7777");
		PreparedStatement st = cn.prepareStatement("SELECT * FROM EMP WHERE EMPID=" + veno,
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery();
		rs.first();
		vsal = rs.getInt(3);
		cn.setAutoCommit(false);
		vsal = vsal + vsal * 30 / 100;
		PreparedStatement pst = cn.prepareStatement("UPDATE EMP SET SALARY=? WHERE EMPID=?");
		pst.setInt(1, vsal);
		pst.setInt(2, veno);
		pst.executeUpdate();
		if(vsal>=1000000)
		{
			cn.rollback();
		}
		else
			cn.commit();
		System.out.println("Process Completed");
	}
}
