package student1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import student1.dto.Student;

public class StudentDao

{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Zaki");
	EntityManager em = entityManagerFactory.createEntityManager();
	EntityTransaction et = em.getTransaction();

	// signup
	public Student signUp(Student student) {
		et.begin();
		em.persist(student);
		et.commit();
		return student;
	}

	// login

	public Student login(String email,String password, Query query)
	{
		//Query querentityManager.createQuery("select s from Student s where s.email=?1 and s.password=?2");
	Query query2	=em.createNamedQuery("");
		query.setParameter(1,email);
		query.setParameter(2,password);
		Student student=(Student) query.getSingleResult();
		
		if(student!=null) {
			return student;
		}
		return null;
	}

}
