package demojdbc;
import java.sql.*;

public class SelectDemo1 {
    public static void main(String[] args) {
        Connection cn=null;
        Statement st=null;
        ResultSet rs=null;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/suhani";
            cn=DriverManager.getConnection(url,"root","7777");
            st=cn.createStatement();
            rs=st.executeQuery("SELECT EMPAME,SALARY FROM EMP ");
            while (rs.next()) {
                System.out.println("Emp Name ="+rs.getString(1));
                System.out.println("Emp Salary ="+rs.getInt(2));
                System.out.println("..".repeat(20));
            }
        }catch(Exception exp)
        {
            System.out.println("Exp="+exp);
        }
        finally {
        	try 
        	{
        		cn.close();
        		st.close();
        		rs.close();
        		
        	}
        	catch(Exception e)
        	{
        		System.out.println("Exp"+e);
        	}
        }
    }
}
