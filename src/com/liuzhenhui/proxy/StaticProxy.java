package com.liuzhenhui.proxy;

/**
 * 代理模式：静态代理 代理对象
 * @author Administrator
 *
 */
public class StaticProxy implements Subject{

	private Subject subject;//被代理对象
	public StaticProxy (Subject subject){
		this.subject = subject;
	}
	@Override
	public void request() {
		System.out.println("开启事务");
		subject.request();
		System.out.println("提交事务");
	}

}
