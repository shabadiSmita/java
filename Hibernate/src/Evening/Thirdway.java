package Evening;
import java.sql.*;

public class Thirdway 
{
	public static void main(String[] args) throws SQLException
	{
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			Connection con= DriverManager.getConnection("jdbc:musql://localhost:3306/batch07","root","root");
			
			Statement stmt=con.createStatement();
			
			boolean result=stmt.execute("select * from person table");
			
			ResultSet resultset= stmt.getResultSet();
			
			while(resultset.next())
			{
				String name= resultset.getString("name");
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			Connection connection = null;
			connection.close();
		}
		
	}

}
