package sdbms;

import java.util.Scanner;
import customexception.InvalidChoiceException;


public class Solution 
{
	
	public static void main(String[] args) {
			
			System.out.println("welcome to Student Databse Project");
			System.out.println("---------------------");
			Scanner sc=new Scanner(System.in);

			//Upcasting For Abstraction 
			StudentManagamentSystem sms=new SMSImpl();


			while(true) {
				//menu driven program
				System.out.println("1:addStudent\n2:displayStudent\n3:displayAllStudent\n4:removeStudent\n5:removeAllStudent\n6:updateStudent\n7:countStudents\n8:sortStudents\n9:getStudentWithHighestMarks\n10:getStudentWithLowestMarks");
				System.out.println("enter choice");
				int choice =sc.nextInt();

				
				
				switch(choice)
				{
				case 1:
					sms.addStudent();		
					break;
					
				case 2:
					sms.displayStudent();
					break;
					
				case 3:
					sms.displayAllStudent();
					break;
					
				case 4: 
					sms.removeStudent();
					break;
					
				case 5:
					sms.removeAllStudent();
					break;
				case 6:
					sms.updateStudent();
					break;
				case 7:
					sms.countStudents();
					break;
				case 8:
					sms.sortStudents();
					break;
				case 9:
					sms.getStudentWithHighestMarks();
					break;
				case 10:
					sms.getStudentWithLowestMarks();
					break;
				case 11:
					System.out.println("thank you");
					System.exit(0);
				default:
					try {
						throw new InvalidChoiceException("Invalid Choice!");
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				}
				System.out.println("------------");
			}
		}
		}


