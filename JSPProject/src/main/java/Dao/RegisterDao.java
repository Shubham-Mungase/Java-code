package Dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.RegisterModel;
import helper.ConnectionProvoider;

public class RegisterDao {
	private static Connection con=null;
	public RegisterDao(Connection con)
	{
		this.con=con;
	}
	
	public static int registerUser(RegisterModel rm) {
		
		
		int result=0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into user (name,email,pass,dob) values(?,?,?,?)");
			ps.setString(1,rm.getName() );
			ps.setString(2,rm.getEmail());
			ps.setString(3,rm.getPass());
			ps.setString(4,rm.getDob() );
			result=ps.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return result;
		
		
	}
	public RegisterModel getUser(String vemail,String vpass)
	{
		
		RegisterModel user =new RegisterModel();
		try {
			PreparedStatement ps=con.prepareStatement("select * from user where email=? and pass=?");
			ps.setString(1, vemail);
			ps.setString(2, vpass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				user.setUid(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPass(rs.getString(4));
				user.setDob(rs.getString(5));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return user;
		
	}

}
