package Second_jdbc.user;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Properties;

	import javax.security.auth.login.AppConfigurationEntry;

	import com.mysql.cj.jdbc.Driver;
	public class UserCrud {
		public Connection getConnection() throws SQLException, IOException
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		    FileInputStream fns = new FileInputStream("config.properties");
		    Properties properties = new Properties();
		    properties.load(fns);
		    Connection connection =DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("userName"),properties.getProperty("password"));
			return connection;
			
		}
		public User signUpUser(User user) throws SQLException, IOException
		{
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("insert into user values(?,?,?,?)");
			statement.setInt(1, user.getIduser());
			statement.setString(2,user.getUserName());
			statement.setString(3,user.getUserEmail());
			statement.setString(4,user.getUserPassword());
			statement.execute();
			connection.close();
			System.out.println("Signed up successfully");
			return user;
		}
		
		

}
