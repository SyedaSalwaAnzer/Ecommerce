package com.salwa.ecommer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.salwa.ecommer.model.Product;



@Component
public class ProductDaoImpl {
			@Autowired
			SessionFactory sessionFactory;
			Product product;
		  public void insertProduct(Product p)
			{
				
				Session session = sessionFactory.openSession();
				session.save(p);
				Transaction transaction=session.beginTransaction();
				transaction.commit();
				session.close();	
			}	
		  
		  public List displayProduct(Product product)
			{ 
		        Session session=sessionFactory.openSession();
		        Transaction transaction=session.beginTransaction();
		        Query query=session.createQuery("from Product");
		        List list=(List) query.list();
		        
		        System.out.println("ouside for each");
		        for(Object o:list)
		        {
		        	Product pro=(Product)o;
		        	
		        	 System.out.println("ID"+pro.getProductId());
		             System.out.println("NAME"+pro.getProductName());
		             System.out.println("PRICE"+pro.getProductPrice());
		             System.out.println("------------------------");	
		        }
		        session.close();
				return list;
			}

		public Product getProduct(int proId) {
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Product where productId=:id");
			Product product=(Product)query.uniqueResult();
			return product;
		}
		  
		  
		  
		  
		}