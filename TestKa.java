package com.baidou;

//银行卡类
class YinHangKa {
	public double yuE=500;// 余额
	
	public void add(double cun){//存款
		yuE+=cun;
		System.out.println("存款成功，余额为："+yuE);
	}
	public void draw(double qu){//取款
		if(yuE>=qu){
			yuE-=qu;
			System.out.println("取款成功，余额为："+yuE);
		}else{
			System.out.println("余额不足，取款失败");
		}
	}
}

//信用卡类
class XinYongKa extends YinHangKa{
	public double touZiE=1000;//透支额度

	@Override
	public void draw(double qu) {
		if((super.yuE+touZiE)>=qu&&super.yuE>=qu){
			super.yuE-=qu;
			System.out.println("取款成功，余额为："+super.yuE+"\t透支额为："+touZiE);
		}else if((super.yuE+touZiE)>=qu&&super.yuE<qu){
			touZiE=super.yuE+touZiE-qu;
			super.yuE=0;
			System.out.println("取款成功，余额为："+super.yuE+"\t透支额为："+touZiE);
		}else{
			System.out.println("余额不足，取款失败");
		}
	}
}

//测试类
public class TestKa {
	public static void main(String[] args) {
		YinHangKa yhk=new YinHangKa();
		XinYongKa xyk=new XinYongKa();
		System.out.println("初始余额为："+yhk.yuE);
		System.out.println("用银行卡存600");
		yhk.add(600);
		System.out.println("用银行卡取700");
		yhk.draw(700);
		System.out.println("用银行卡取1000");
		yhk.draw(1000);
		System.out.println("用信用行卡存100");
		xyk.add(100);
		System.out.println("用信用卡取200");
		xyk.draw(200);
		System.out.println("用信用卡取1000");
		xyk.draw(1000);
	}
}
