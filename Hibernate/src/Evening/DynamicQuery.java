package Evening;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicQuery 
{
	public static void main(String[] args) throws SQLException 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Statement statement=Connection.createStatement();
		} 
		
		catch (ClassNotFoundException e)
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
