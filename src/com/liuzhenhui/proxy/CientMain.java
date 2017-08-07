package com.liuzhenhui.proxy;

import org.junit.Test;

/**
 * 代理模式：客户端代码
 * 
 * @author Administrator
 *
 */
public class CientMain {

	/**
	 * 静态代理实现
	 */
	@Test
	public  void staticProxy() {
		RealSubject realSubject = new RealSubject();
		StaticProxy proxy1 = new StaticProxy(realSubject);
		proxy1.request();
	}
	
	/**
	 * 动态代理实现
	 */
	@Test
	public void dynamicProxy(){
		RealSubject realSubject = new RealSubject();
		DynamicProxy invocationHandler = new DynamicProxy();
		//获取目标类的代理类
		Object object = invocationHandler.blind(realSubject);
		Subject subject = (Subject)object;
		subject.request();
	}
	
}
