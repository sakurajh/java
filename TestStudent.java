package com.baidou;

class People{
	public void read() {
		System.out.println("父类方法，在读书");
	}
	public void sleep() {
		System.out.println("父类方法，在睡觉");
	}
}
class Student5 extends People{
	public void sleep() {//方法重写
		System.out.println("子类方法，在睡觉");
	}
}
public class TestStudent {
public static void main(String[] args) {
	People student1 = new Student5();
	//向上转型，调用父类的方法。
	//如果子类覆写了父类的该方法，则调用子类的覆写方法
	//如果子类覆写了父类的属性，依然调用父类的属性
	student1.read();
	student1.sleep();
	}
}