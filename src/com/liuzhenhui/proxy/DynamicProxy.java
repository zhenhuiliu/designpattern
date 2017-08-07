package com.liuzhenhui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式 动态代理 代理对象
 * @author Administrator
 *
 */
public class DynamicProxy implements InvocationHandler{

	private Object target;
	
	public DynamicProxy() {
		super();
	}
	//给被代理类返回一个实例化的代理类对象
	public Object blind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	//任何调用被代理对象的方法最终都是调用invoke方法。
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();  
        System.out.println(" -----动态代理 开启事务");  
        Object invoke = method.invoke(target, args);  
        long stopTime = System.currentTimeMillis();  
        System.out.println("动态代理 提交事务" + (stopTime - startTime) + "毫秒！");  
        return invoke;  
	}

	
}
