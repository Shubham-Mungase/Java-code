package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaData {
	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/suhani";
		Connection cn=DriverManager.getConnection(url,"root","7777");
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM EMP");
		ResultSetMetaData rsmt=rs.getMetaData();
		for(int i=1;i<rsmt.getColumnCount();i++)
		{
			System.out.print(rsmt.getColumnName(i)+"\t\t\t");
		}
		System.out.println();
		while(rs.next())
		{
			for(int i=1;i<rsmt.getColumnCount();i++)
			{
				System.out.print(rs.getString(i)+"\t\t\t");
			}
			System.out.println();
		}
		System.out.println("No of column="+rsmt.getColumnCount());
		System.out.println("column type name="+rsmt.getColumnTypeName(2));
		System.out.println("Table name="+rsmt.getTableName(1));
		System.out.println(rsmt.getColumnLabel(1));
		System.out.println(rsmt.getColumnLabel(2));
		System.out.println(rsmt.getColumnLabel(3));
		System.out.println(rsmt.getColumnLabel(4));
	}

}
