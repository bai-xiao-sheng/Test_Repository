package com.shipin;

/** 
 * @ClassName: Test_duotai
 * @Description: ��ѧϰ��̬��һ�������ڲ�ͬ״̬�µĶ���״̬
 * @author: bai-xiao-sheng
 * @Date: 2018��5��1�� ����5:12:14 
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
		System.out.println("��֪��ʲô�����ʲô");
	}
	
	public void cry() {
		System.out.println("��֪����ô��");
	}
}

class Food {
	String name;
	public void showName() {
		
	}
}

class Cat extends Animal {
	public void cry() {
		System.out.println("������");
	}
	
	public void eat() {
		System.out.println("è����");
	}
}

class Dog extends Animal {
	public void cry() {
		System.out.println("������");
	}
	
	public void eat() {
		System.out.println("���Թ�ͷ");
	}
}

class Bone extends Food {
	public void showName() {
		System.out.println("��ͷ");
	}
}

class Fish extends Food {
	public void showName() {
		System.out.println("��");
	}
}