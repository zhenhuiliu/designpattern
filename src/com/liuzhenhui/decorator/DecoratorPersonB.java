package com.liuzhenhui.decorator;
/**
 * 装饰类b
 * @author Administrator
 *
 */
public class DecoratorPersonB extends Decorator{

	@Override
	public void eat(){
		super.eat();
		System.out.println("b eat ");
	}
}
