package com.baidou;


public class Test2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		try {
		System.out.println("before");
		// arr = null;
		System.out.println(arr[100]);
		System.out.println("after");
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("这是个数组下标越界异常");
		e.printStackTrace();
		} catch (NullPointerException e) {
		System.out.println("这是个空指针异常");
		e.printStackTrace();
		}
		System.out.println("after try catch");
		}
}
