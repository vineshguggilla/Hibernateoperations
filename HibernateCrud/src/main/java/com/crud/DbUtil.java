package com.crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtil {
	
	static SessionFactory sf;
	
	static {
		
		sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
	}
	
	
	
	public static SessionFactory getinstanceof() {
		
		sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		return sf;
		
		
		
		
	}
	

}
