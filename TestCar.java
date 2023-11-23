package com.baidou;


class Bus{
	String carstyle;
	String num;
	
	Bus(String carstyle,String num) {
        this.carstyle=carstyle;
        this.num = num;
    }	
	void start() {
		System.out.println("我是车,我启动");
	}
	void end() {
		System.out.println("我是车,我停止");
	}
}

class Taxi extends Bus{
	String company;
	
	Taxi(String carstyle,String num,String company) {
        super(carstyle, num);
        this.company = company;
    }	
	void start() {
		System.out.println("我是车,我启动");
	}
	void end() {
		System.out.println("我是车,我停止");
	}
}

class SmallCar extends Bus{
	String Name;
	
	SmallCar(String carstyle,String num,String Name) {
        super(carstyle, num);
        this.Name = Name;
    }
	void start() {
		System.out.println("我是武大郎,我的汽车我做主");
	}
	void end() {
		System.out.println("目的地到了,我们去玩吧");
	}
}

public class TestCar {
	public static void main(String[] args) {
		Taxi taxi= new Taxi("宝马","晋M12345" ,"景顺出租公司" );
		SmallCar car=new SmallCar("奥迪", "晋M54321", "武大郎");
		taxi.start();
		taxi.end();
		System.out.println("======================");
		car.start();
		car.end();
		System.out.println("======================");
		System.out.println("乘客你好,我是"+taxi.company+"我的车牌号是"+taxi.num+",你要去哪里啊");
		System.out.println("目的地已经到了,请你下次付款,欢迎再次乘坐");
	}
}
