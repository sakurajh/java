package com.baidou;

import java.util.*;

interface IShape{
	abstract double getFace();
}

class Square implements IShape{
	double side;
	public Square(double side) {
		this.side=side;
	}

	@Override
	public double getFace() {
		return Math.pow(side, 2);
	}
	
}
public class Test5 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入正方形的边长：");
        double side = input.nextDouble();
        Square square = new Square(side);
        System.out.println("正方形的面积为: " + square.getFace());
        input.close();
    }
}
