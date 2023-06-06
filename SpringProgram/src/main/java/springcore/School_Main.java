package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School_Main 
{
	public static void main(String[] args) 
	{
		BeanFactory beanfactory=new ClassPathXmlApplicationContext("mobile.xml");
		Dps dps=(Dps) beanfactory.getBean("dps");
		dps.name();
		System.out.println(dps.getFees());
		
		Ghs ghs= (Ghs) beanFactory.getBean("ghs");
		ghs.name();
		System.out.println(ghs.getFees());
		
	}

}
