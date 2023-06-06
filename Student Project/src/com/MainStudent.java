package com;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MainStudent 
{
	public static void main(String[] args) 
		{
			Student s1=new Student("Tom", 20);
			Student s2=new Student("Jerry", 23);
			Student s3=new Student("Nobita", 25);
			Map<Integer,Student> map=new LinkedHashMap<Integer, Student>();


			map.put(1,s1); //new Student("Tom", 20);
			map.put(2,s2); //new Student("Jerry", 23);
			map.put(3,s3); //new Student("Nobita", 25);

			//Converting Map into Set using keySet()
			Set<Integer> keys=map.keySet();

			//Creating an instance of ArrayList & up-casting to List
			List<Student> list=new ArrayList<Student>();

			for(Integer key:keys)
			{
				Student std=map.get(key); //getting the value (Student objects)

				list.add(std);// Adding the value (Student objects) into ArrayList

				System.out.println(std); // printing the value (Student Object)
			}
		}
}

		


