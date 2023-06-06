package OnetooneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller1 {

public static void main(String[] args) {
	
	EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("smita");
	EntityManager entityManager= managerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	

		AdharCard adharCard=new AdharCard();
		adharCard.setAdharnum(1);
		adharCard.setName("Anu");
		adharCard.setPhone(345678912l);
		
		PanCard card=new PanCard();
		card.setPannum(40);
		card.setName("Anu");
		card.setPhone(3456789121l);
		
		//mapping
		card.setAdharCard(adharCard);
		
		entityTransaction.begin();
		entityManager.persist(adharCard);
		entityManager.persist(card);
		entityTransaction.commit();
		System.out.println("data saved");
		
		

}
}
