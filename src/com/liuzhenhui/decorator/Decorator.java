package com.liuzhenhui.decorator;

/**
 * 装饰类的抽象类
 * @author Administrator
 *
 */
public class Decorator implements Person{
	private Person person;
	
	public void setPerson(Person person){
		this.person = person;
	}

	@Override
	public void eat() {
		if(null != person){
			person.eat();
		}
	}

}
