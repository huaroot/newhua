package org.student.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ContextSessionRequestListener implements ServletRequestListener,ServletContextListener,HttpSessionListener
{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("监听HttpSession, 创建了HttpSession:"+se);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("监听HttpSession完了，销毁了HttpSession:"+se);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("监听ServletContext完了，销毁了ServletContext。。。。。"+sce);
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("监听ServletContext, 创建了ServletContext。。。。。"+sce);
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("监听ServletRequest完了，销毁了ServletRequest。。。。。"+sre);
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("监听ServletRequest, 创建了ServletRequest。。。。。"+sre.getServletRequest().getLocalName());
	}
	
	 	
}
