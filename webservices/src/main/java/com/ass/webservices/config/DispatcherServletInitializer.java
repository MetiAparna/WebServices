package com.ass.webservices.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletInitializer  implements WebApplicationInitializer
{
    @SuppressWarnings("resource")
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(ProductConfiguration.class);
	//	ctx.refresh();
		
		DispatcherServlet servlet = new DispatcherServlet();
		Dynamic dynamic = servletContext.addServlet("Dispatcher", servlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
		
		
	}	
	 //context--execution terminology

}
