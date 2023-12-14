package com.baidou;

import java.util.*;

interface Solid{
	double getFace();
	double getVolume();
}
class Cube implements Solid{
	double a;
	
	public Cube(double a) {
        this.a = a;
    }	
	@Override
	public double getFace() {		
		return 6*Math.pow(a, 2);
	}
	@Override
	public double getVolume() {
		return Math.pow(a, 3);
	}	
}

class Sphere implements Solid{
	double radius;
	
	public Sphere(double radius) {
        this.radius = radius;
    }
	@Override
	public double getFace() {
		return 4*Math.PI*Math.pow(radius, 2);
	}
	@Override
	public double getVolume() {
		return (4.0/3)*Math.PI*Math.pow(radius, 3);
	}	
}
public class Test4 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入立方体的边长：");
        double side = input.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("立方体的表面积为: " + cube.getFace());
        System.out.println("立方体的体积为: " + cube.getVolume());

        System.out.println("请输入球体的半径：");
        double radius = input.nextDouble();
        Sphere sphere = new Sphere(radius);
        System.out.println("球体的表面积为: " + sphere.getFace());
        System.out.println("球体的体积为: " + sphere.getVolume());
        input.close();
    }
	
}
