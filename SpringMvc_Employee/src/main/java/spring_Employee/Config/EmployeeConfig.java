package spring_Employee.Config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages= {"springMvc_Employee"})
public class EmployeeConfig {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory entitymanagerfactorty=persistence.createEntityManagerFactory(null);
		Entitymanager entityManager=entityManagerFactory.createEntityManager();
		
	}

}
9