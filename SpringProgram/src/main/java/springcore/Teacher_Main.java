package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher_Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext  context=new ClassPathXmlApplicationContext("teacher.xml");
		Teacher1 teacher1=context.getBean("teacher", Teacher1.class);
		System.out.println(teacher);
		
		
	}

}
