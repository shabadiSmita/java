package onetoonemapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonemapping.dto.Hotel;
import onetoonemapping.dto.Item;

public class HotelDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction =entityManager.getTransaction();
	
	public void save(Hotel hotel, Item item) {
		transaction.begin();
		entityManager.persist(hotel);
		entityManager.persist(item);
		transaction.commit();
		System.out.println("data is saved");
	}
	
	public void delete(int id) {
		transaction.begin();
		Hotel ht = entityManager.find(Hotel.class, id);
		entityManager.remove(ht);
		Item it=entityManager.find(Item.class, id);
		entityManager.remove(it);
		transaction.commit();
		System.out.println("data is deleted");
		
	}

}
