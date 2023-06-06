package sdbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customexception.InvalidChoiceException;
import customexception.StudentNotFoundException;
import customsorting.SortStudentByAge;
import customsorting.SortStudentById;
import customsorting.SortStudentByMarks;
import customsorting.SortStudentByName;



public class SMSImpl implements StudentManagamentSystem {
	//scanner
	//Collection -> db -> Map -> <String , Student> -> LinkedHashMap

	Scanner scan=new Scanner(System.in);
	Map<String ,Student> db=new LinkedHashMap<String ,Student>();

	@Override
	public void addStudent() {
		//accept age,name&marks
		//Student instance
		//add student instance into DB(MAP) -> put()
		//print student id

		System.out.println("enter student age");
		int age=scan.nextInt();
		System.out.println("enter student name");
		String name=scan.next();
		System.out.println("enter student marks");
		int marks=scan.nextInt();

		Student std=new Student(age,name,marks);
		db.put(std. getId(), std);
		System.out.println("student Record INserted Successfully");
		System.out.println("student Id is "+std.getId());
	}

	@Override
	public void displayStudent() 
	{
		System.out.println("Enter Student Id");
		String id=scan.next();
		id=id.toUpperCase(); // String id=sc.next().toUpperCase();
		if(db.containsKey(id))
		{
			Student std=db.get(id); // getting students Objects
			System.out.println("Student Details are as Follows:");
			System.out.println("Student Id: "+std.getId());
			System.out.println("Student Name: "+std.getname());
			System.out.println("Student Age: "+std.getAge());
			System.out.println("Student Marks: "+std.getMarks());
		}
		else
		{
			try
			{
				String message="Student with the id "+id+" is not Found!!";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException s)
			{
				System.out.println(s.getMessage());
			}
		}
	}


	@Override
	public void displayAllStudent() {
		//Map into Set -> KeySet()
		//for each loop traverse Keys
		//db.get(key) -> toString() -> print

		if(db.size()!=0) {
			System.out.println("Student Details are as Follows");
			System.out.println("-------------------");
			Set<String> keys = db.keySet();
			for(String key  : keys) {
				Student std=db.get(key);
				System.out.println(std); //System.out.println(db.get(key));

			}

		}
		else {
			try {
				String msg=" Student Databse is Empty, Nothing to Display";
				throw new StudentNotFoundException(msg);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMsg());
			}
		}

	}

	@Override
	public void removeStudent() {
		System.out.println("enter Student Id:");
		String id=scan.next();
		id=id.toUpperCase();
		if(db.containsKey(id)) {
			System.out.println("Student Record Found!");     //getting and Student object
			System.out.println(db.get(id));
			db.remove(id);    //remove student object
			System.out.println("Student Record Deleted Successfully");		
		}
		else
		{
			try {
				String msg=" Student with the Id "+id+" is not Found!!";
				throw new StudentNotFoundException(msg);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMsg());
			}
		}
	}

	@Override
	public void removeAllStudent() {
		if(db.size()!=0)
		{
			System.out.println("Avaliable Student Records:" +db.size());
			db.clear();
			System.out.println("All the Student Records Deleted Successfully!");
		}
		else
		{
			try {
				String msg=" Student Databse is Empty, Nothing to Display";
				throw new StudentNotFoundException(msg);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMsg());
			}
		}
	}

	@Override
	public void updateStudent() {
		System.out.println("enter Student Id:");
		String id=scan.next();
		id=id.toUpperCase();
		if(db.containsKey(id)) {
			Student s=db.get(id);
			System.out.println("1:Update Age\n2:Update Name\n3:Update Marks");
			System.out.println("Enter Choice");			
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Age:");
				int age=scan.nextInt();
				s.setAge(age);			//s.setAge(sc.nextInt());
				System.out.println("Age Updated Successfully!");
				break;
			case 2:
				System.out.println("Enter Name:");
				String name=scan.next();
				s.setname(name);			//s.setName(sc.nextInt());
				System.out.println("Name Updated Successfully!");
				break;
			case 3:
				System.out.println("Enter Marks:");
				int marks=scan.nextInt();
				s.setAge(marks);			//s.setMarks(sc.nextInt());
				System.out.println("Marks Updated Successfully!");
				break;
			default:
				try
				{
					throw new InvalidChoiceException("Invalid Choice!");

				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
		else
		{
			try {
				String message=" No Sufficient Students Records to sort!!";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}




	}

	@Override
	public void countStudents() {
		System.out.println("No of Student Records: +db.size()");
	}





	@Override

	public void sortStudents() {
		if(db.size()>=2) 
		{
			List<Student> list=new ArrayList<Student>();
			Set<String> keys = db.keySet();
			for(String key: keys)
			{
				list.add(db.get(key));
			}
			System.out.println("1:sort student By Id\n2:sort Student By Age");
			System.out.println("3sort Name By Id\n4:sort Student By Marks");
			System.out.println("Enter Choice");
			int choice=scan.nextInt();

			switch(choice) {
			case 1:
				Collections.sort(list ,new SortStudentById());
				break;
			case 2:
				Collections.sort(list ,new SortStudentByName());
				break;
			case 3:
				Collections.sort(list ,new SortStudentByAge());
				break;
			case 4:
				Collections.sort(list ,new SortStudentByMarks());

				break;
				default:
					try
					{
						String message="No Sufficient student Records to Compare!";
						throw new InvalidChoiceException(message);
					}
					catch(InvalidChoiceException s)
					{
						System.out.println(s.getMessage());
					}



			}
			}
	}

			private static void display(List<Student> list)
			{
				for(Student s: list)
				{
					System.out.println(s);
				}
			}

			@Override
			public void getStudentWithHighestMarks() 
			{
				if(db.size()>=2)
				{
					List<Student> list=new ArrayList<Student>();
					Set<String> keys=db.keySet();
					for(String key:keys)
					{
						list.add(db.get(key)); //getting & adding objects in ArrayList
					}
					Collections.sort(list, new SortStudentByMarks());
					System.out.println(list.get(list.size()-1));
				}
				else
				{
					try
					{
						String message="No Sufficient student Records to Compare!";
						throw new StudentNotFoundException(message);
					}
					catch(StudentNotFoundException s)
					{
						System.out.println(s.getMessage());
					}
				}
			}



			@Override
			public void getStudentWithLowestMarks() 
			{
				if(db.size()>=2)
				{
					List<Student> list=new ArrayList<Student>();
					Set<String> keys=db.keySet();
					for(String key:keys)
					{
						list.add(db.get(key)); //getting & adding objects in ArrayList
					}
					Collections.sort(list, new SortStudentByMarks());
					System.out.println(list.get(0));
				}
				else
				{
					try
					{
						String message="No Sufficient student Records to Compare!";
						throw new StudentNotFoundException(message);
					}
					catch(StudentNotFoundException s)
					{
						System.out.println(s.getMessage());
					}
				}


			}


		}




