package First_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete 
{
	public static void main(String[] args) throws SQLException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent","root","root");
			Statement statement=connection.createStatement();
			statement.execute("delete from student2 where id=102");
			connection.close();
			System.out.println("data deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
