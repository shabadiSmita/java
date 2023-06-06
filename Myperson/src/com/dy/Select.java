package com.dy;

import java.sql.*;

public class Select 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:musql://localhost:3306/mypersondet","root" ,"root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from person1");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			//System.out.println(resultSet.getInt(3));
		}
		connection.close();

		
	}
	
	
}
