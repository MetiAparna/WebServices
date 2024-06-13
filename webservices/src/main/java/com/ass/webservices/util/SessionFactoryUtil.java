package com.ass.webservices.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ass.webservices.entity.ProductEntity;

public class SessionFactoryUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getFactory() {
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(ProductEntity.class);
		
		sessionFactory = cfg.buildSessionFactory();
		
		return sessionFactory;
		
	}
	

}
