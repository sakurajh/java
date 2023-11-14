package com.baidou;


import java.util.*;
//猫类
class Cat1 {
	private String name;
	private int age;
	private String colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Cat1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat1(String name, int age, String colour) {
		super();
		this.name = name;
		this.age = age;
		this.colour = colour;
	}
	public void print(){
		System.out.println("姓名："+name+"\t年龄："+age+"\t颜色："+colour);
	}
}

//测试类
public class TestCat {
	public static void main(String[] args) {
		Cat1 cat1=new Cat1();
		cat1.setName("小花");
		cat1.setAge(3);
		cat1.setColour("花色");
		Cat1 cat2=new Cat1();
		cat2.setName("小白");
		cat2.setAge(3);
		cat2.setColour("白色");

		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("请输入猫的姓名：");
			String name=sc.next();
			if(cat1.getName().equals(name)){
				cat1.print();
				break;
			}else if(cat2.getName().equals(name)){
				cat2.print();
				break;
			}else{
				System.out.println("没有这只猫，请重新输入");
			}
		}
	}
}
