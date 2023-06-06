package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {
	
	@Autowired
	@Qualifier(value="lion")
	private Animal animal;
	
	 void animalSound() {
		 
	 System.out.println("animal is making sound");
	 animal.sound();
	 }

}
