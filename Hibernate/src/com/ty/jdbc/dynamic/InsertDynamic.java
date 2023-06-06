package com.ty.jdbc.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamic 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the id to be inserted");
		int id=Scanner.nextInt();
		System.out.println("enter the name to be inserted");
		String name=Scanner.next();
		System.out.println("enter the marks to be inserted");
		int marks=Scanner.next.Int();
		String ClassName="com.mysql.cj.jdbc.Driver");
		String userName="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/dynamicstudent";
		Class.forName("className");
		
		//establish the connection
		Connection connection=DriverManager.getConnection(url,userName,password);
		
		//create statement
		PreparedStatement statement=connection.prepareStatement("insert into student values(!,!,!)");
		Statement.SetInt(1, id);
		Statement.SetStirng(2. name);
		Statement.SetString(2, email);
		
		//execute statement
		Statement.execute();
		
		//close
		Connection.close();
		System.out.println("inserrted");
		
		
		
	}

}
