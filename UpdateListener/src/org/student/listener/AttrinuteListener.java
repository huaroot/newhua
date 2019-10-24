package org.student.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class AttrinuteListener implements ServletRequestAttributeListener, ServletContextAttributeListener,HttpSessionAttributeListener
{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		String attriName = event.getName();
		Object attriValue = event.getSession().getAttribute(attriName);
		System.out.println("HttpSession【增加】属性名："+attriName+",属性值："+attriValue);
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("HttpSession【删除】属性名："+event.getName());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		String attriName = event.getName();
		Object attriValue = event.getSession().getAttribute(attriName);
		System.out.println("HttpSession【替换】属性名："+attriName+",属性值："+attriValue);
	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		String attriName = scae.getName();
		Object attriValue = scae.getServletContext().getAttribute(attriName);
		System.out.println("ServletContext【增加】属性名："+attriName+",属性值："+attriValue);
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext【删除】属性名："+scae.getName());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		String attriName = scae.getName();
		Object attriValue = scae.getServletContext().getAttribute(attriName);
		System.out.println("ServletContext【增加】属性名："+attriName+",属性值："+attriValue);
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		String attriName = srae.getName();
		Object attriValue = srae.getServletRequest().getAttribute(attriName);
		System.out.println("ServletRequest【增加】属性名："+attriName+",属性值："+attriValue);
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("ServletRequest【删除】属性名："+srae.getName());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		String attriName = srae.getName();
		Object attriValue = srae.getServletRequest().getAttribute(attriName);
		System.out.println("ServletRequest【替换】属性名："+attriName+",属性值："+attriValue);
	}
	
}
