package com.liuzhenhui.decorator;

/**
 * 被装饰对象的具体类
 * @author Administrator
 *
 */
public class Man implements Person{

	@Override
	public void eat() {
		System.out.println("man eat");
	}

}
