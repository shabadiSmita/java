package Second_jdbc.user;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class User 
{
	private int Userid;
	private String Username;
	private int Usergetuserpassword;
	private String Useremail;
	
	
	
	
	
	
	public int getUserid() {
		return Userid;
	}






	public void setUserid(int userid) {
		Userid = userid;
	}






	public String getUsername() {
		return Username;
	}






	public void setUsername(String username) {
		Username = username;
	}






	public int getUsergetuserpassword() {
		return Usergetuserpassword;
	}






	public void setUsergetuserpassword(int usergetuserpassword) {
		Usergetuserpassword = usergetuserpassword;
	}






	public String getUseremail() {
		return Useremail;
	}






	public void setUseremail(String useremail) {
		Useremail = useremail;
	}






	public static void main(String[] args)
	{
		
	}
	

}
