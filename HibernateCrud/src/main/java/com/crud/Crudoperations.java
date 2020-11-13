package com.crud;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Crudoperations {

	public static void main(String[] args) {

		saveoperation();
		// deleteopertion();

		// updateopertion();

		// readOpertion();

		// getallreadOpertion();

	}

	public static void saveoperation() {
		SessionFactory sessionFactory = DbUtil.getinstanceof();

		Projectpojo projectpojo = new Projectpojo(9, "america", 7223, 45000);
		


		Session session = sessionFactory.openSession();
		
		session.save(projectpojo);

	
		
		/*

		Projectpojo projectpojo = new Projectpojo(6, "adiadas", 92343, 35000);
		Projectpojo projectpojo1 = new Projectpojo(7, "trends", 92245, 96000);
		Projectpojo projectpojo2 = new Projectpojo(8, "gvk", 92280, 54000);

		List<Projectpojo> list = new ArrayList<Projectpojo>();

		list.add(projectpojo);
		list.add(projectpojo1);
		list.add(projectpojo2);

		

		for (Projectpojo projectpojo3 : list) {
			session.save(projectpojo3);

		}
*/
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

		session.close();

	}

	public static void readOpertion() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();

		Session session = sessionFactory.openSession();

		Projectpojo read = (Projectpojo) session.get(Projectpojo.class, 2);

		System.out.println(read.getProId() + "       " + read.getProName());

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

			System.out.println(
					projectpojo.getProId() + " " + projectpojo.getProNumber() + " " + projectpojo.getProName());
		}

		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}

}
