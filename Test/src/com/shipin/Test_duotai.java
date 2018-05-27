package com.shipin;

/** 
 * @ClassName: Test_duotai
 * @Description: 简单学习多态：一个引用在不同状态下的多种状态
 * @author: bai-xiao-sheng
 * @Date: 2018年5月1日 下午5:12:14 
 */
public class Test_duotai {

	public static void main(String[] args) {
		Master master = new Master();
		master.feed(new Dog(), new Bone());
		master.feed(new Cat(), new Fish());
	}

}

class Master {
	public void feed(Animal an,Food f) {
		an.eat();
		f.showName();
	}
}

class Animal {
	String name;
	int age;
	
	public void eat() {
		System.out.println("不知道什么动物吃什么");
	}
	
	public void cry() {
		System.out.println("不知道怎么叫");
	}
}

class Food {
	String name;
	public void showName() {
		
	}
}

class Cat extends Animal {
	public void cry() {
		System.out.println("喵喵叫");
	}
	
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Dog extends Animal {
	public void cry() {
		System.out.println("汪汪叫");
	}
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
}

class Bone extends Food {
	public void showName() {
		System.out.println("骨头");
	}
}

class Fish extends Food {
	public void showName() {
		System.out.println("鱼");
	}
}