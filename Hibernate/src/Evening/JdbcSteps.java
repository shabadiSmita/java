package Evening;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

//7 steps
//importing the pacakges
//loading ad registering the driver
//Establishing the connection
//Establishing the statement
//executing the statement
//Processing the result
//closing the connection

public class JdbcSteps 
{
public static void main(String[] args) 
{
	try {
		
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		DriverManager.getConnection("jdbc:mysql://localhost:3306//batch07 ","root " ," ");
		Statement statement=Connection.createStatement()
		int result = statement.executeUpdate("insert into batch.table07 values(1,'parth',22),(2,'bhumi',23 ");
		if(result>0)
		{
			System.out.println(result+ "person data got inserted");
		}
		else 
		
	{
			System.out.println("no data got inserted");
	}
	}
		
		
		
	
		 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
		 connection.close();
	}
}

			



