package springMvc1_Employee.Config;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;

	@Configuration
	@ComponentScan(basePackages={"springMvc1_Employee"})
	public class EmployeeCongifg {
		
		@Bean
		public EntityManager getEntityManager() {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("smita");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			return entityManager;	
		}		
}
