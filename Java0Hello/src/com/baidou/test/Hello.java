package com.baidou.test;
import java.util.Scanner;
import java.util.Random;

public class Hello {
	public static void main(String[]args) {
		
	}
	
	//猜数字小游戏
	public static void main6(String[]args) {
		Random random=new Random();//随机时间
		Scanner sc=new Scanner(System.in);
		int guss=random.nextInt(100)+1;
		while(true) {
			System.out.println("请输入数字:");
			int num=sc.nextInt();
			if(num<guss){
				System.out.println("低了");
			}else if(num>guss){
				System.out.println("高了");
			}else {
				System.out.println("猜对了");
				break;
			}
		}
		sc.close();
	}
	
	public static void main5(String[]args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num=0;
		while(sc.hasNextInt()) {
			int tmp=sc.nextInt();
			sum+=tmp;
			num++;
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+sum/num);
		sc.close();
	}
	
	public static void main4(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name=sc.nextLine();
		System.out.println("请输入你的年龄");
		int age=sc.nextInt();
		System.out.println("请输入你的工资");
		float salary=sc.nextFloat();
		System.out.println("你的信息如下");
		System.out.println("姓名"+name+"\n"+age+"\n"+"工资"+salary);
		sc.close();//关闭scanner,下次不能再调用
		
}
	
	public static void main3(String[]args) {
		//找到 100 - 200 中所有 3 的倍数
		int num=100;
		while(num<=200) {
			if(num%3!=0) {
				num++;
				continue;
			}
			System.out.println(num);
			num++;
		}
	}
	
	public static void main2(String[]args) {
		//判断闰年
		int year=2000;
		if(year%100==0) {
			if(year%400==0) {
				System.out.println("闰年");
			}else {
			System.out.println("不是闰年");
		}
		}else {
			if(year%4==0) {
				System.out.println("是闰年");
			}else {
				System.out.println("不是闰年");
			}
		}
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
