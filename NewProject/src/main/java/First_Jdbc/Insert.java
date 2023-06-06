package First_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert 
{
	public static void main(String[] args) throws SQLException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent","root","root");
			
			
			
			Statement statement=connection.createStatement();
			statement.execute("insert into student2 values(101, 'Preeti',22,'female')");
			statement.execute("insert into student2 values(102, 'Aishu',23,'female')");
			statement.execute("insert into student2 values(103, 'Somi',21,'female')");
			statement.execute("insert into student2 values(104, 'Sam',26,'female')");
			connection.close();
			System.out.println("Data Saved");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
