package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal_Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("animal.xml");
		Lion lion=context.getBean("lion",Lion.class);
		lion.sound();
		
		//Cage cage=context.getBean("cage", Cage.class);
		//cage.animalSound();
	}

}
