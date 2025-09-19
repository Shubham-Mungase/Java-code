package demojdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TransactionDemo2 {
	public static void main(String[] args)  {

		
		int vaccno1,vaccno2,amt,a;
		PreparedStatement st1=null,st2=null;
		Connection cn=null;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Customer Acc no who want to transfer Amt : ");
			vaccno1=Integer.parseInt(br.readLine());
			System.out.println("Enter Customer Acc no which you want to transfer Amt : ");
			vaccno2=Integer.parseInt(br.readLine());
			System.out.println("Enter Amt to be transfer :");
			amt=Integer.parseInt(br.readLine());
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/suhani";
		cn = DriverManager.getConnection(url, "root", "7777");
		cn.setAutoCommit(false);
		st1=cn.prepareStatement("update customer set amount=amount-? where accno=?");
		st1.setInt(1, amt);
		st1.setInt(2, vaccno1);
		st1.executeUpdate();
		//System.out.println("Enter Customer acc no in which account amt is transfer ");
		//a=Integer.parseInt(br.readLine());
		st2=cn.prepareStatement("update customer set amount=amount+? where accno=?");
		st2.setInt(1, amt);
		st2.setInt(2, vaccno2);
		st2.executeUpdate();
		cn.commit();
		System.out.println("Process Completed");
		}
		catch(Exception e)
		{
			
			try
			{
				System.out.println("Exp ="+e);
				cn.rollback();
			}catch (Exception e1) {
				// TODO: handle exception
				System.out.println("Exp1="+e1);
			}
			
		}
		finally {
			try
			{
				cn.close();
				st1.close();
				st2.close();
			}catch(Exception e)
			{
				System.out.println("Exp="+e.getMessage());
			}
			
			
		}
		
		
	}
}
