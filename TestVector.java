package com.baidou;

import java.util.*;

public class TestVector {
	public static void main(String[] args) {
		 	Vector<String> stringV = new Vector<>();
	        Scanner reader = new Scanner(System.in);
	        System.out.print("请输入字符串（输入0结束）：");
	        String input = reader.nextLine();
	        while (!input.equals("0")) {
	            stringV.add(input);
	            System.out.print("请输入字符串（输入0结束）：");
	            input = reader.nextLine();
	        }
	        
	        System.out.println("保存的字符串为：");
	        for (String str : stringV) {
	            System.out.println(str);
	        }
	        
	        for (int i = 0; i < stringV.size(); i++) {
	            String y = stringV.get(i);
	            int insert = y.length() / 2;
	            String m = y.substring(0, insert) + "NICE" + y.substring(insert);
	            stringV.set(i, m);
	        }
	        System.out.println("\n插入后的字符串为：");
	        for (String str : stringV) {
	            System.out.println(str);
	        }
	}

}
