package com.liuzhenhui.proxy;

/**
 * 代理模式：被代理对象
 * @author Administrator
 *
 */
public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("realSubject request");
	}

	
}
