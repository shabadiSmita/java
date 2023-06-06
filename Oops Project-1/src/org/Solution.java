package org;
import java.util.Scanner;

public class Solution
{

	public static void main(String[] args) 
	{
		
		 Scanner scan=new Scanner(System.in);
		 
		 //upcasting for abstraction
		 Calculator calc=new Calculatorimpl();
		 
		 //menu driven program
		 while(true)
		 {
			 System.out.println("1:addition\n2:substraction\n3:multipication\n4:division\n5:exit");
			 System.out.println("Enter Choice");
			 int choice = scan.nextInt();
			 int a=0;
			 int b=0;
			 
			 if(choice>=1 && choice<=4)
			 {
				 System.out.println("enter first number");
				 a=scan.nextInt();
				 System.out.println("enter second number");
				 b=scan.nextInt();
			 }
			 switch(choice)
			 {
			 case 1:
				 System.out.println("sum of" + a+" & "  + b+" is " + calc.add(a, b));
				 break;
			 case 2:
				 System.out.println("difference of" + a+" & "  + b+" is " + calc.sub(a, b));
				 break;
			 case 3:
				 System.out.println("product of" + a+" & "  + b+" is " + calc.mul(a, b));
				 break;
			 case 4:
				 int result=calc.div(a, b);
				 if(result!=0)
				 {
					 System.out.println("division of" + a+" & "  + b+" is " + calc.div(a, b));
 
				 }
				 else
				 {
					 System.out.println("Kindly do not divide by 0");
				 }
				 break;
			 case 5:
				 System.out.println("exit");
				 System.exit(0);
				 default:
					 System.out.println(calc.invalidChoice());
		 }
		 
	}

	}
}

