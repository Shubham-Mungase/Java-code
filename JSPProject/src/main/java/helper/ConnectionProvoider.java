package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvoider {
	
	private static Connection con;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/rushi","root","7777");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}

}
