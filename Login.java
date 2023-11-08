package com.baidou;

public class Login {
	 
	public static void main(String[] args) {
		Login lo = new Login();
		lo.showUI();
	}
	public void showUI(){
		//窗体类
		javax.swing.JFrame jf = new javax.swing.JFrame();
		//窗体名称
		jf.setTitle("QQ登陆界面");
		//窗体大小（具体值跟电脑显示器的像素有关，可调整到合适大小）
		jf.setSize(400, 500);
		//设置退出进程的方法
		jf.setDefaultCloseOperation(3);
		//设置居中显示用3
		jf.setLocationRelativeTo(null);
		
		//流式布局管理器
		java.awt.FlowLayout flow = new java.awt.FlowLayout();
		jf.setLayout(flow);  //给窗体设置为流式布局——从左到右然后从上到下排列自己写的组件顺序
		
		//图片，冒号里是你存图片的地址
		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("D:\\Picture\\01.jpg");			
		//标签
		javax.swing.JLabel jla = new javax.swing.JLabel(icon);
		java.awt.Dimension dm0=new java.awt.Dimension(280,200);
		//设置大小
		jla.setPreferredSize(dm0);//应用大小到相应组件
		jf.add(jla);//将组件加到窗体上
		
		//文本框
		javax.swing.JTextField jtf = new javax.swing.JTextField();
		java.awt.Dimension dm = new java.awt.Dimension(280, 30);
		//(除了JFrame)其它所有组件设置大小都是该方法
		jtf.setPreferredSize(dm);
		jf.add(jtf);
		
		//复选框
		javax.swing.JCheckBox jcb = new javax.swing.JCheckBox("记住密码");
		jf.add(jcb);
		
		javax.swing.JCheckBox jcb2 = new javax.swing.JCheckBox("忘记密码");
		jf.add(jcb2);
		
		//按钮
		javax.swing.JButton jbu = new javax.swing.JButton("登陆");
		jf.add(jbu);   //给窗体添加一个按钮对象
		
		jf.setVisible(true);   //设置可见，放在代码最后一句
	}
 
}