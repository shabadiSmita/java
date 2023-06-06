package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School1_Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("school1.xml");
		Teacher teacher= (Teacher) applicationcontext.getBean("teacher1");
		School school= (School) applicationcontext.getBean("school1;");
		System.out.println(school.getTeacher());
		System.out.println(school.getFees());
		System.out.println(school.getName());

		
	}

}
