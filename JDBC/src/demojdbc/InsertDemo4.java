package demojdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertDemo4 {

	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ResultSet rs=null;
		int veno,vsal,edeptid;
		String vname;
		try {
			System.out.println("Enter Emp No :");
			veno=Integer.parseInt(br.readLine());
			System.out.println("Enter Emp Name :");
			vname=br.readLine();
			System.out.println("Enter Emp Salary :");
			vsal=Integer.parseInt(br.readLine());
			System.out.println("Enter Dept ID :");
			edeptid=Integer.parseInt(br.readLine());
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st=cn.prepareStatement("SELECT * FROM EMP",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery();
			rs.moveToInsertRow();
			rs.updateInt(1, veno);
			rs.updateString("empname", vname);
			rs.updateInt("salary", vsal);
			rs.updateInt(4, edeptid);
			rs.insertRow();
			System.out.println("Record Inserted");
		}catch(Exception e)
		{
			System.out.println("Exp="+e);
			try
			{
				br.close();
				cn.close();
				rs.close();
				st.close();
			}catch(Exception e1)
			{
				System.out.println("Exp="+e1);
			}
		}

}
}
