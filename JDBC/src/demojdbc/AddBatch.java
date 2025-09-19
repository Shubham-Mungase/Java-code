package demojdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddBatch {

	public static void main(String[] args) throws Exception {
		Connection cn = null;
		ResultSet rs = null;
		Statement st=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st=cn.createStatement();
			st.addBatch("insert into emp values(11,'Pathan',300001,3)");
			st.addBatch("insert into emp values(12,'Jawan',512001,4)");
			st.addBatch("update emp set salary=3234532 where empid=7");
			st.addBatch("delete from emp where empid=8");
			int counts[]=st.executeBatch();
			for(int i=0;i<counts.length;i++)
			{
				if(counts[i]==1) {
					System.out.println("okk");
				}
				else
				{
					System.out.println("not okk");
				}
			}
			
	
		
		}

	
}
