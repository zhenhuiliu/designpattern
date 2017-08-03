package com.liuzhenhui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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
	
	public DynamicProxy(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();  
        System.out.println("开启事务");  
        Object invoke = method.invoke(target, args);  
        long stopTime = System.currentTimeMillis();  
        System.out.println("提交事务" + (stopTime - startTime) + "毫秒！");  
        return null;  
	}

	
}
