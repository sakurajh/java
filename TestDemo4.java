package com.baidou;

class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person：构造方法执行");
	}

	{
		System.out.println("Person：实例代码块执行");
	}
	static {
		System.out.println("Person：静态代码块执行");
	}
}

class Student extends Person {
	public Student(String name, int age) {
		super(name, age);
		System.out.println("Student：构造方法执行");
	}

	{
		System.out.println("Student：实例代码块执行");
	}
	static {
		System.out.println("Student：静态代码块执行");
	}
}

public class TestDemo4 {
	public static void main(String[] args) {
		Student student1 = new Student("张三", 19);
		System.out.println("===========================");
		Student student2 = new Student("gaobo", 20);
	}

	public static void main1(String[] args) {
		Person person1 = new Person("bit", 10);
		System.out.println("============================");
		Person person2 = new Person("gaobo", 20);
	}
}