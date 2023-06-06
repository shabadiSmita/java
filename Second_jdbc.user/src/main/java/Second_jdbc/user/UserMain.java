
package Second_jdbc.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the userid");
		int userId=scanner.nextInt();
		System.out.println("enter the username");
		String userName=scanner.next();
		System.out.println("enter the useremail");
		String useremail=scanner.next();
		System.out.println("enetr the password");
		String password=scanner.next();
		
		User user=new User();
		user.setUserid(userId);
		user.setUsername(userName);
		user.setUseremail(userEmail);
		user.setPassword(userPassword);
		
		UserCrud crud=new UserCrud();
		try {
			crud.signUpUser(user);
			
		}
		catch (SQLException e) {
		e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
