package OnetoManuUni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller3 {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null);
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Company company=new Company();
	company.setId(31);
	company.setNamw("somi");
	company.setAddress("ElectronicCity");
	
	
    Employee employee=new Employee();
    employee.setId(401);
    employee.setName("Somii");
    employee.setEmail("somi@gmail.com");
    employee.setPassword("somi123");
    
    Employee employee2=new Employee();
    employee.setId(402);
    employee.setName("Sampatti");
    employee.setEmail("sam@gmail.com");
    employee.setPassword("sam123");
    
    List<Employee> employees=new ArrayList<Employee>();
    employees.add(employee);
    employees.add(employee2);
    
    //mapping
    company.setEmployee(employees);
    
    entityTransaction.begin();
    entityManager.persist(company);
    entityManager.persist(employee);
    entityManager.persist(employee2);
    entityTransaction.commit();
}
	
}
