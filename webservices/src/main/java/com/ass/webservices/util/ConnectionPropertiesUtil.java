package com.ass.webservices.util;

import java.util.Properties;

public class ConnectionPropertiesUtil {
	
	
	public static Properties getMysqlDbProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("Connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate_db");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "password");
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		
		properties.setProperty("hibernate.show_sql","true");
		properties.setProperty("hibernate.hbm2ddl.auto","update");//neverUsed in realtime(creating table auto)

		return properties;
	}

}
