package com.liuzhenhui.decorator;

/**
 * 装饰模式客户端。
 * @author Administrator
 *
 */
public class ClientMain {

	public static void main(String[] args) {
		Man man = new Man();
		DecoratorPersonA a = new DecoratorPersonA();
		DecoratorPersonB b = new DecoratorPersonB();
		a.setPerson(man);
		b.setPerson(a);
		b.eat();
	}
}
