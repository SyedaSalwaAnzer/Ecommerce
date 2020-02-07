package com.salwa.ecommer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salwa.ecommer.model.User;

@Component
	public class UserDaoImpl {
		@Autowired
		SessionFactory sessionFactory;
		User user;
		public void testSessionFactory()
		{
			System.out.println("sf-----------------"+sessionFactory);
		}
	  public void insertUser(User u)
		{
			
			Session session = sessionFactory.openSession();
			session.save(u);
			Transaction transaction=session.beginTransaction();
			transaction.commit();
			session.close();
			
		}
	  @Autowired
		SessionFactory sessionFactory1;
		
	  public List displayUser(User user)
		{ 
	        
	      
	        Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from User");
	        List list=(List) query.list();
	        System.out.println("ouside for each");
	        for(Object o:list)
	        {
	        	User user2=(User)o;
	        	
	        }

	        session.close();
			return list;
		}
		
		
	
		
		
	}
