package com.baidou;

public class Test3{
	public static void main(String[] args) {
	    long start = System.currentTimeMillis();
	    String s = "";
	    for(int i = 0; i < 100000; ++i){
	        s += i;
	    }
	    long end = System.currentTimeMillis();
	    System.out.println(end - start);
	 
	    start = System.currentTimeMillis();
	    StringBuffer sbf = new StringBuffer("");
	    for(int i = 0; i < 100000; ++i){
	        sbf.append(i);
	    }
	    end = System.currentTimeMillis();
	    System.out.println(end - start);
	    start = System.currentTimeMillis();
	    StringBuilder sbd = new StringBuilder();
	 
	    for(int i = 0; i < 100000; ++i){
	        sbd.append(i);
	    }
	 
	    end = System.currentTimeMillis();
	    System.out.println(end - start);
	}
	 
}
