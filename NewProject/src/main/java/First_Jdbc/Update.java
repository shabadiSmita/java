package First_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update 
{
	public static void main(String[] args) throws SQLException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent","root","root");
			Statement statement=connection.createStatement();
			statement.execute("update from student2 name='preeti' where id=105");
			
			connection.close();
			System.out.println("Data Updated");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
