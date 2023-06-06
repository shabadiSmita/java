package com.jspider.Hibernate.TestProject;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mysql.cj.xdevapi.SessionFactory;

public class App 
{
	public static void main(String[]args) {
		Student st=new Student();
		st.setUsn(10);
		st.setName("sandya");
		st.setMarks(99.99);
		
		
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory sessionfactory=configuration.buildSessionFactory();
	Session session=buildSessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(st);
	tx.commit();
	session.close();
	buildSessionFactory.close();
	
	 
	
	
	
	
	
	
	}

}
