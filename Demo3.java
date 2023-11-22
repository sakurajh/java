package com.baidou;
import javax.swing.*;

public class Demo3 {
	public static void main(String arges[]) {
		Object[] obj2 ={ "路人甲", "路人乙", "路人丙" };  
		String s = (String) JOptionPane.showInputDialog(null,"请选择你的身份:\n", "身份", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "足球");
		//利用强制转换(String)						
	}
	

}
