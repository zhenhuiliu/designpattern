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
	
	
}
