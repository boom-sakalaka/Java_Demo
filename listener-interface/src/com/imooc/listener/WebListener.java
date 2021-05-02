package com.imooc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebListener implements ServletContextListener,HttpSessionListener,ServletRequestListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Servlet已销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Servlet已初始化");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSession session = se.getSession();
		System.out.println("session已初始化" + session.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("session已销毁");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request已销毁" );
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest request =  (HttpServletRequest)sre.getServletRequest();
		// TODO Auto-generated method stub
		System.out.println("request已初始化" + request.getRequestURI());
		// TODO Auto-generated method stub
	
	}

}
