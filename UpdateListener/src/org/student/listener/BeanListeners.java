package org.student.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class BeanListeners implements HttpSessionActivationListener,Serializable
{
	private int mun;
	private String user;
	public int getMun() {
		return mun;
	}
	public void setMun(int mun) {
		this.mun = mun;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	//监听刚刚活化之后时刻
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("活化之后，BeanListeners对象会随着session的活化而活化");
	}
	//监听即将钝化之前时刻
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("即将钝化之前，BeanListeners对象会随着session的钝化而钝化");
	}

}
