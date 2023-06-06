package springMvc1_Employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringAnnotation.Employee;


@Repository
public class EmployeeDao {
	
    @Autowired
	private EntityManager entityManager;
    
	public Employee saveEmployee(Employee employee) {
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();

		return employee;
		
	}

	
	
}
