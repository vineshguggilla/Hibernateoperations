package com.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateQueryoperation {
	public static void main(String[] args) {

		//queryoperation();
	}
	
	
	// if are use junit test remove static  if u r not add static

	public  void queryoperation() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();
		Session session = sessionFactory.openSession();

		// you can write any our own sql querys
		/*
		 * String HQl = "from Projectpojo";
		 * 
		 * Query query = session.createQuery(HQl);
		 * 
		 * List<Projectpojo> list = query.list();
		 * 
		 * for (Projectpojo projectpojo : list) {
		 * 
		 * System.out.println(projectpojo.getProId() + " " + projectpojo.getProName());
		 * 
		 * }
		 */

		// you retrieve by using named params

		// String HQL="from Projectpojo where proName=:vinname and proId=:vinid";

		/*
		 * String HQL = "from Projectpojo where proName=:vinname"; Query query =
		 * session.createQuery(HQL);
		 * 
		 * query.setParameter("vinname", "JIO"); // query.setParameter("vinid", 4);
		 * 
		 * Object uniqueResult = query.uniqueResult();
		 * 
		 * System.out.println(uniqueResult);
		 */

		// positional params by using hql querys
/*
		String hql = "from Projectpojo where  proName=? and  proSalary=?";

		Query query = session.createQuery(hql);

		query.setParameter(0, "puma");
		query.setParameter(1, 21000);

		Object uniqueResult = query.uniqueResult();

		System.out.println(uniqueResult);*/
		
		
		//if you have two propertys as same name then we can use like this
		
		
		String hql = "from Projectpojo where  proName=?";

		Query query = session.createQuery(hql);

		query.setParameter(0, "vinesh");
		
		List<Projectpojo> list = query.list();

		for (Projectpojo projectpojo : list) {
			
			System.out.println(projectpojo.getProSalary()+" "+projectpojo.getProName()+" "+projectpojo.getProNumber());
		}
		
		
		
		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}

}
