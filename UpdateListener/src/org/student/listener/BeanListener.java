package org.student.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class BeanListener implements HttpSessionBindingListener
{

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("绑定Bean对象(bean()对象增加到session域)，绑定的对象："+this+",sessionId值是："+event.getSession().getId());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("解绑Bean对象(bean()对象在session域中解绑)，解绑的对象："+this+",sessionId值是："+event.getSession().getId());
	}	
	
}
