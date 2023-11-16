package com.baidou;

import java.util.*;
import java.text.*;

class StdWeight{
	double high;
	double wight;
	
	static String forMale(double h) {
		h=((h-80)*0.7)*(1+0.1);
		DecimalFormat h1=new DecimalFormat("0.00");
		String s1=h1.format(h);
		return s1;
	}
	
	static String forFeMale(double h) {
		h=((h-70)*0.6)*(1-0.1);
		DecimalFormat h2=new DecimalFormat("0.00");
		String s2=h2.format(h);
		return s2;
	}
}

public class TestWeight {
	public static void main(String agrs[]) {
		Scanner reader=new Scanner(System.in);
		StdWeight x=new StdWeight();
		System.out.println("请输入用户的身高(以cm为单位):");
		Double high=reader.nextDouble();
		System.out.println("请输入用户的性别(男或女):");
		String gender=reader.next();
		double lowerWeight = high * 0.9;
        double upperWeight = high * 1.1;
		String upperhigh1=x.forFeMale(upperWeight);
		String lowerhigh2=x.forFeMale(lowerWeight);
		
		String upperhigh3=x.forMale(upperWeight);
		String lowerhigh4=x.forMale(lowerWeight);
		if("女".equals(gender)) {
			String high2=x.forFeMale(high);
			System.out.println("你的标准身高为:"+high2+"kg,正常体重范围为:"+lowerhigh2+"kg~"+upperhigh1+"kg");
		}else if("男".equals(gender)){
			String high3=x.forMale(high);
			System.out.println("你的标准身高为:"+high3+"kg,正常体重范围为:"+lowerhigh4+"kg~"+upperhigh3+"kg");
		}else {
			System.out.println("你输入的性别不对!!!");
		}
	}
}
