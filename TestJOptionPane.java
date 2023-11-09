package com.baidou;
import javax.swing.*;

public class TestJOptionPane {
	public static void main(String args[] ) {
		//消息对话框（showMessageDialog）有三种构造函数
		//1、JOptionPane.showMessageDialog(parentComponent, message);
		//2、JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
		//3、JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
		
		//icon:自定义消息图标
		//message:对话框现实的内容
		
		//JOptionPane.showMessageDialog(null, "我是笨蛋");
		//JOptionPane.showMessageDialog(null, "我是笨蛋","你关不掉",JOptionPane.DEFAULT_OPTION);
		//JOptionPane.showMessageDialog(null, "我是笨蛋","你关不掉",JOptionPane.DEFAULT_OPTION,new ImageIcon("messages/gren.png"));
		
		//JOptionPane.showMessageDialog(null,"基本框","Title",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"警示框","Title",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"错误提示框","Title",JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null,"提问框","Title",JOptionPane.QUESTION_MESSAGE);
		//------------------------------------------------------------------------------
		
		
		//选择对话框（showOptionDialog）只有一种构造函数
		// JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
		//Object[] options = {"是", "不是"};
		//JOptionPane.showOptionDialog(null,"你是笨蛋吗","title",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE,null,options,options);
		
		//Object[] options = {"喜欢", "不喜欢"};        //定义按钮上的文字
		//int x = JOptionPane.showOptionDialog(null,"你喜欢我吗？","Title",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options);
		//------------------------------------------------------------------------------
		
		//确认对话框（showConfirmDialog）有以下四种构造函数
		/*
		1、JOptionPane.showConfirmDialog(parentComponent, message)
		2、JOptionPane.showConfirmDialog(parentComponent, message, title, optionType)
		3、JOptionPane.showConfirmDialog(parentComponent, message, title, optionType,messageType)
		4、JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType, icon)
		 */
		//JOptionPane.showConfirmDialog(null,"你是赵建华吗?","888",JOptionPane.OK_CANCEL_OPTION);
		//JOptionPane.showConfirmDialog(null,"你是赵建华吗?");
		
		//int n = JOptionPane.showConfirmDialog(null,"你是否喜欢java？","Title",JOptionPane.YES_NO_CANCEL_OPTION);
		//System.out.println(n);	
		
		//-----------------------------------------------------------------------------
		//输入对话框（showInputDialog）有六种构造函数
		//System.out.println(name);
		/*
		1、JOptionPane.showInputDialog(message);
		2、JOptionPane.showInputDialog(parentComponent, message);
		3、JOptionPane.showInputDialog(message, initialSelectionValue);
		4、JOptionPane.showInputDialog(parentComponent,message,initialSelectionValue)
		5、JOptionPane.showInputDialog(parentComponent,message, title, messageType);
		6、JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue)
		 */
		//JOptionPane.showInputDialog(null,"你要输入什么","456",JOptionPane.OK_OPTION);\
		
		//String name = JOptionPane.showInputDialog(null,"Please enter your account\n","Title",JOptionPane.PLAIN_MESSAGE);
		
		
		//Object[] options = {"中国", "美国","德国",4};        //定义下拉框选项    当数组长度大于等于20时，会变成列表框
		//Object object =  JOptionPane.showInputDialog(null,"请选择你的国籍\n","Title",JOptionPane.QUESTION_MESSAGE,new ImageIcon("D://地球.png"), options,"中国");
		//System.out.println(object);
		//System.out.println(object instanceof String);
		
		
		//大于20变成列表框
		//Object[] options = {"中国", "美国","德国",4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};        //定义下拉框选项    当数组长度大于等于20时，会变成列表框
		//Object object =  JOptionPane.showInputDialog(null,"请选择你的国籍\n","Title",JOptionPane.QUESTION_MESSAGE,new ImageIcon("D://地球.png"),options,"中国");
		//System.out.println(object instanceof String);
		
	
	}
}
