package com.baidou;


public class Demo1 {
	
	public class Animal {
		public void show() {
			System.out.println("我是动物");
		}
	}
	public class Tiger extends Animal {
		public void show() {
			System.out.println("我是老虎");
		}
	}
	public class Dog extends Animal {
		public void show() {
			System.out.println("我是哈士奇");
		}
	}
	public static void main(String[] args) {
		Animal one = new Animal();
		one.show();
		Animal two = new Tiger();
		two.show();
		Animal three = new Dog();
		three.show();
	}
}
