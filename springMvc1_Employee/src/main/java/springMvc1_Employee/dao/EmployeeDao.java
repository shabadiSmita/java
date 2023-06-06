package springMvc1_Employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springMvc1_Employee.dto.EmployeeDto;

@Repository
public class EmployeeDao {
	
	public EmployeeDao() {
		System.out.println("Employee DAO");
	}
	
    @Autowired
	private EntityManager entityManager;
    
    public EmployeeDto saveEmployee(EmployeeDto employee) {
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	entityTransaction.begin();
    	entityManager.persist(employee);
    	entityTransaction.commit();
		return employee;
		
    }
    
    
    public List<EmployeeDto> getAllEmployees(){
    	Query query= entityManager.createQuery("select e from Employee e");
		
    	return query.getResultList();
    	
    }
    
		
}
