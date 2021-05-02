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
		System.out.println("Servlet������");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Servlet�ѳ�ʼ��");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSession session = se.getSession();
		System.out.println("session�ѳ�ʼ��" + session.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("session������");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request������" );
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest request =  (HttpServletRequest)sre.getServletRequest();
		// TODO Auto-generated method stub
		System.out.println("request�ѳ�ʼ��" + request.getRequestURI());
		// TODO Auto-generated method stub
	
	}

}
