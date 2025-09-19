package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Model.LoginModel;

public class LoginDao {
	boolean res=false;
	public boolean loginDao(LoginModel lm){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rushi","root","7777");
			PreparedStatement ps=con.prepareStatement("select * from user where email=? and pass=?");
			ps.setString(1, lm.getEmail());
			ps.setString(2, lm.getPass());
			res=ps.execute();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return res;
	}

}
