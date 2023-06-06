package com.jdbc.employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class EmployeeCrud 
{
	public Connection getConnection() throws IOException ,SQLException{
	  Driver driver=new Driver();
	  DriverManager.registerDriver(driver);
	  FileInputStream fileInputStream=new FileInputStream(" .properties");
	  Properties properties = new Properties();
	  properties.load(fileInputStream);
	  Connection connection= DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
	  return connection;
}

 public Employee saveEmloyee(Employee emp) throws SQLException,IOException {
 Connection connnection=getConnection();
 String query="insert into table employee values(?,?,?,?,?)";
 PreparedStatement preparedstatement = connnection.prepareStatement(query);
 preparedstatement.setInt(1, emp.getId());
 
 preparedstatement.setString(2, emp.getName());
 preparedstatement.setLong(3, emp.getPhone());
 preparedstatement.setString(4, emp.getEmail());
 preparedstatement.setString(5, emp.getPassword());
 preparedstatement.setDouble(6, emp.getSalary());
 preparedstatement.executeUpdate();
 preparedstatement.close();
// System.out.println("Inserted");
 connnection.close();
 
 
 return emp;
 
 }
 
 }
 

 
 
 