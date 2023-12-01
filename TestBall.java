package com.baidou;
import java.util.*;

class Ball{
	private double radius;	
	public void setRadious(double radius) {
		this.radius=radius;
	}
	
	public Double getRaidous() {
		return radius;
	}
	
}
class Billiards extends Ball{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}	
	public void info() {
		System.out.println("台球的颜色为:"+color);
		System.out.println("台球的半径值为:"+getRaidous());
	}
}
public class TestBall {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Billiards bill=new Billiards();
		System.out.println("请输入你要设置的颜色:");
		String color=reader.next();
		System.out.println("请输入你要设置的半径:");
		double radius=reader.nextDouble();
		bill.setColor(color);
		bill.setRadious(radius);
		bill.info();
	}
}
