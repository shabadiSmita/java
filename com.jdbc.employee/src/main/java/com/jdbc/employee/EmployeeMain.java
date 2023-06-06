package com.jdbc.employee;

import java.util.Scanner;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the phone");
		long phone=sc.nextLong();
		System.out.println("Enter the email");
		String email=sc.next();
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		System.out.println("Ener the password");
		String password=sc.next();
		
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setPassword(password);
		emp.setEmail(email);
		emp.setSalary(salary);
		System.out.println("data entered");
		
		
	}


}
