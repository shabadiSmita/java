package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;

public class UserDAO 
{
	public void saveUser(User user) throws SQLException
	{
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/b8";
			connection=DriverManager.getConnection(dbUrl,"root","Geethagd@123");
			String query="insert into user values(!,!,!)";
			PreparedStatement ps=connection.prepareStatement(query);
			
			
			int id= user.getId();
			String name=user.getName();
			String email=user.getEmail();
			
			ps.setInt(1, id);
			ps.setString(2,  name);
			ps.setString(2,  email);
			
			ps.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(connection!=null) {
			try {
				connection.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		}
		
		
	}
	public static void main(String[] args) throws SQLException 
	{
	    UserDAO dao= new UserDAO();
	    
		User user = new User();
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter your id");
	    int id= sc.nextInt();
		
	    System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter ypour email");
		String email=sc.next();
		
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		
		dao.saveUser(user);

		
	}

}
