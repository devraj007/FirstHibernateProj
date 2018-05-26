package com.devraj.hibernate;

import org.hibernate.cfg.Configuration;

import com.javabrains.devraj.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		
/*		To save this object in database using hibernate API
		Few steps to use hibernate API
		create a session factory
		crete a session from session factory
		use the session to save model object */	 
	
		org.hibernate.SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		org.hibernate.Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
