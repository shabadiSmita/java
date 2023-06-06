package OnetooneUni2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller2 {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null);
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Passport pass=new Passport();
		pass.setPid(11);
		pass.setPnmae("rudra");
		pass.setPhone(6789345689l);
		
		Person person=new Person();
		person.setPid(21);
		person.setName("veeresh");
		person.setPhone(4567890l);
		
		 pass.setPerson( person);
		 
		 entityTransaction.begin();
		 entityManager.persist(person);
		 entityManager.persist(pass);
		 entityTransaction.commit();
	
		
		
		
	}

}
