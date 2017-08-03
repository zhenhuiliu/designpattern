package com.liuzhenhui.decorator;
/**
 * 装饰类a
 * @author Administrator
 *
 */
public class DecoratorPersonA extends Decorator{

	@Override
	public void eat(){
		super.eat();
		System.out.println("a eat ");
	}
}
