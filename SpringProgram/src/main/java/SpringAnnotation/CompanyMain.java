package SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("company.xml");
		Company company=context.getBean("company",Company.class);
		Employee
		
	}

}
