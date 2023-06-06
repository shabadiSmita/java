package com;
import java.util.Scanner;

public class Solution
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	Calculatormpl calc=new Calculatormpl();
	//menu driven program
	System.out.println("1:Addition\n2:Subsrtacion\n3:Multiplication");
	System.out.println("4:Division\n5:Exit");
	System.out.println("Enter choice:");
	int choice =scan.nextInt();
	int a=0;
	int b=0;
	if(choice>=1 && choice<=4) {
		System.out.println("Enter First num");
		a=scan.nextInt();
		System.out.println("Enter Second num");
		a=scan.nextInt();
}
	
	switch(choice) {
	case 1:
		System.out.println("Sum: "+calc.add(10,20));
	}
	{
		
		//case 2:
			System.out.println("difference "+calc.sub(10,20));
		}
	{
		
		//case 3:
			System.out.println("product: "+calc.mul(10,20));
		}
	{
		
		//case 4:
			System.out.println("divisible: "+calc.div(10,20));
		}
}

}
