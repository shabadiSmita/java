package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent", "root", "root");
			Statement statement=connection.createStatement();
			statement.execute("insert into student values(101,'smita',21,'female')");
			statement.execute("insert into student values(102,sam',23,'female')");
			statement.execute("insert into student values(103,'som',28,'female')");
			statement.execute("insert into student values(104,'sita',22,'female')");
			connection.close();
			System.out.println("data saved");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	

}
