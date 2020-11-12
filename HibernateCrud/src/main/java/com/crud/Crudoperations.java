package com.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Crudoperations {

	public static void main(String[] args) {

		//saveoperation();
		//deleteopertion();

		 //updateopertion();
		
		//readOpertion();
		
		getallreadOpertion();

	}

	public static void saveoperation() {
		SessionFactory sessionFactory = DbUtil.getinstanceof();

		//Projectpojo projectpojo = new Projectpojo(3, "puma", 92201, 21000);

		Session session = sessionFactory.openSession();

		//session.save(projectpojo);

		Transaction transaction = session.beginTransaction();
		transaction.commit();

		session.close();

	}

	public static void updateopertion() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();

		Session session = sessionFactory.openSession();

		Projectpojo pojo = (Projectpojo) session.get(Projectpojo.class, 2);

		pojo.setProName("vinesh");

		session.update(pojo);

		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}

	public static void deleteopertion() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();

		Session session = sessionFactory.openSession();

		Projectpojo pojo1 = (Projectpojo) session.get(Projectpojo.class, 1);

		session.delete(pojo1);

		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}

	
	
	public static void readOpertion() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();

		Session session = sessionFactory.openSession();

		Projectpojo read= (Projectpojo) session.get(Projectpojo.class, 2);
		
		System.out.println(read.getProId()+"       "+read.getProName());
		
		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}
	
	
	
	
	public static void getallreadOpertion() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();

		Session session = sessionFactory.openSession();

		
		Query query = session.createQuery(" from Projectpojo");
		
		List<Projectpojo> list = query.list();
		
		for (Projectpojo projectpojo : list) {
			
			
			System.out.println(projectpojo.getProId()+" "+projectpojo.getProNumber()+" "+projectpojo.getProName());
		}
		
		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
