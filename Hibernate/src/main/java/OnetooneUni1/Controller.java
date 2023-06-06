package OnetooneUni1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null);
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	
	BankAccount account=new BankAccount();
	account.setBid(101);
	account.setName("ramesh");
	
	
	
	Person1 person=new Person1();
	person.setId(111);
	person.setName("vidya");
	
	//mapping
	account.setPerson(person);
	
	transaction.begin();
	entityManager.persist(person);
	entityManager.persist(account);
	transaction.commit();
}
}
