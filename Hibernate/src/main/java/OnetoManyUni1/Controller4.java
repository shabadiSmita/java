package OnetoManyUni1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller4 {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("smita");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Hotel hotel=new Hotel();
	hotel.setId(201);
	hotel.setHname("ShreeSai");
	hotel.setAddress("Rajaginagar");
	
	
	Items items=new Items();
	items.setId(401);
	items.setIname("GobiManchuri");
	
	Items items2=new Items();
	items2.setId(402);
	items2.setIname("Dosa");
	
	Items items3=new Items();
	items3.setId(403);
	items3.setIname("Puri");
	
	List<Items> items1=new ArrayList<Items>();
	items1.add(items);
	items1.add(items2);
	items1.add(items3);
	}
	
	hotel.setItems(items1);
	 
		
	
	
	

}
