package com.dy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mypersondet", "root", "root");
			Statement statement=connection.createStatement();
			statement.execute("insert into person values(1,'smita',22,'female','smita@123')");
			statement.execute("insert into person values(2,'smita',22,'female','smita@123')");
			statement.execute("insert into person values(3,'smita',22,'female','smita@123')");

			connection.close();
			System.out.println("data saved");
		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			
		}
		
	}
	

}
