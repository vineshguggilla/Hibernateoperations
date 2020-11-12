package com.crud;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;

public class Crteiriaoperations {

	final static Logger LOGGER = Logger.getLogger(Crteiriaoperations.class);

	public static void main(String[] args) {

		getalldetails();

		// conditionscheck();
		// cheackprojections();
		//cheakedparams();

	}

	// if are use junit test remove static if u r not add static

	public static void getalldetails() {
		LOGGER.info("enter into  the program ");
		

		try {
			// get all details by using criteria
			SessionFactory sessionFactory = DbUtil.getinstanceof();
			Session session = sessionFactory.openSession();

			LOGGER.debug("enter into the get details");
			Criteria criteria = session.createCriteria(Projectpojo.class);

			List<Projectpojo> list = criteria.list();

			for (Projectpojo l1 : list) {

				System.out.println(
						l1.getProName() + " " + l1.getProSalary() + "" + l1.getProId() + " " + l1.getProNumber());

			}

			LOGGER.debug("printed the get details");

			Transaction transaction = session.beginTransaction();

			transaction.commit();

			session.close();

			LOGGER.info("exit into  the program ");

		} catch (Exception e) {

			e.printStackTrace();
			LOGGER.error("print   the program error ");

		}

	}

	public static void conditionscheck() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Projectpojo.class);

		// by using restrictions property name equal to given property it returns
		// specific data
		/*
		 * //Criterion eq = Restrictions.eq("proId", 1);
		 * 
		 * criteria.add(eq);
		 * 
		 * Projectpojo uniq = (Projectpojo) criteria.uniqueResult();
		 * 
		 * System.out.println(uniq.getProName() + " " + uniq.getProId() + " " +
		 * uniq.getProSalary());
		 * 
		 */

		// by using restrictions property name greater then > to given property it
		// returns data who are greater than
		/*
		 * Criterion gt = Restrictions.gt("proSalary", 21000);
		 * 
		 * criteria.add(gt); List<Projectpojo> list = criteria.list();
		 * 
		 * for (Projectpojo projectpojo : list) {
		 * 
		 * System.out.println(projectpojo.getProId()+" "+projectpojo.getProName()+" "
		 * +projectpojo.getProSalary()+" "+projectpojo.getProNumber());
		 * 
		 * 
		 * }
		 */
		// by using restrictions property name less than < to given property it returns
		// data who are less than
		Criterion lt = Restrictions.lt("proSalary", 21000);

		criteria.add(lt);
		List<Projectpojo> list = criteria.list();

		for (Projectpojo projectpojo : list) {

			System.out.println(projectpojo.getProId() + " " + projectpojo.getProName() + " "
					+ projectpojo.getProSalary() + " " + projectpojo.getProNumber());

		}

		// by using restrictions property name between less value to high value to given
		// property it returns data
		// who are having between less than to greater than

		/*
		 * Criterion between = Restrictions.between("proSalary", 20000, 21000);
		 * 
		 * criteria.add(between); List<Projectpojo> list = criteria.list();
		 * 
		 * for (Projectpojo projectpojo : list) {
		 * 
		 * System.out.println(projectpojo.getProId() + " " + projectpojo.getProName() +
		 * " " + projectpojo.getProSalary() + " " + projectpojo.getProNumber());
		 * 
		 * }
		 */

		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}

	public static void cheackprojections() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Projectpojo.class);

		// one total row get at a time by using set projections
		PropertyProjection property = Projections.property("proSalary");

		/*
		 * criteria.setProjection(property);
		 * 
		 * List<Object> list = criteria.list(); for (Object object : list) {
		 * 
		 * System.out.println(object); }
		 */

		// multiple rows get at a time

		PropertyProjection property2 = Projections.property("proName");

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(property);
		projectionList.add(property2);

		criteria.setProjection(projectionList);

		List list = criteria.list();

		for (Object obj : list) {
			System.out.println(obj);
		}

		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}

	public static void cheakedparams() {

		SessionFactory sessionFactory = DbUtil.getinstanceof();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Projectpojo.class);

		// by using Restrictions.like querys to return who like property name as given
		// property it returns data
		/*
		 * Criterion like = Restrictions.like("proName", "vinesh");
		 * 
		 * 
		 * criteria.add(like);
		 * 
		 * List list = criteria.list();
		 * 
		 * 
		 * for (Object object : list) {
		 * 
		 * System.out.println(object);
		 * 
		 * }
		 */

		Criterion like = Restrictions.like("proName", "JIO");

		criteria.add(like);

		List list = criteria.list();
		for (Object object : list) {

			System.out.println(object);

		}

		/*
		 * Object uniqueResult = criteria.uniqueResult();
		 * 
		 * System.out.println(uniqueResult);
		 */
		Transaction transaction = session.beginTransaction();

		transaction.commit();

		session.close();

	}

}
