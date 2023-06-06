package org;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter choice");
			int choice=scan.nextInt();
			switch(choice)
	{
			case 1 :
				System.out.println("Hi");
			break;
			case 2:
				System.out.println("Bye");
			break;
			case 3:
				System.out.println("Thank You");
			System.exit(0);//Terminate the program(jvm)
			default:
				System.out.println("Invalid");

}
			System.out.println("-------------");
		}
	}

}
