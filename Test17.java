package com.baidou;
public class Test17 {
	 
    public static void main(String[] args) {
        int i = 5;
 
        Integer it = new Integer(i);
         
        //封装类型转换成基本类型
        int i2 = it.intValue();
        
        //自动转换就叫拆箱
        int i3 = it;
         
    }
}
