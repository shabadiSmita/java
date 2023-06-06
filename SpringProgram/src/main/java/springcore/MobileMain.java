package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain 
{
	public static void main(String[] args) 
	{
		//Mobile mobile=new Mobile();
		//mobile.Used();
		BeanFactory beanfactory=new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile=(Mobile) beanfactory.getBean("mobile");
		mobile.Used();
	}
	

}
