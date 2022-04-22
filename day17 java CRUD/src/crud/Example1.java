package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 
{

	public static void main(String[] args)
	{
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Sample";
		String dbUserName="root";
		String dbPassword="Slnaik@123";
		
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql="INSERT INTO Employee1(user_id,user_Name,Password,email)VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(sql);
			//p.setString(1, "101");
			//p.setString(2, "Shankar");
			//p.setString(3, "Pass@123");
			//p.setString(4, "Slnaik@gmail.com");
			
			//p.setString(1, "102");
			//p.setString(2, "Reshma");
			//p.setString(3, "Pass@432");
			//p.setString(4, "rc@gmail.com");
			
			//p.setString(1, "103");
			//p.setString(2, "irfan");
			//p.setString(3, "Pass@768");
			//p.setString(4, "irfn@gmail.com");
			
			p.setString(1, "104");
			p.setString(2, "Yashvanth");
			p.setString(3, "Pass@9876");
			p.setString(4, "Yshvnt@gmail.com");
			
			int row=p.executeUpdate();
			if(row>0)
			{
				System.out.println("A new user was inserted successfully");
			}
			c.close();
			
			
			
			if(c!=null)
			{
				System.out.println("Connected");
				c.close();
			}
			
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();  
		}
	}

}