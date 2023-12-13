package com.baidou;

import java.util.*;

public class Demo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三条边长a,b,c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        try{
            triangle(a,b,c);
        }catch (IllegalArgumentException e){
           e.printStackTrace();
        }
    }
    // 定义三角形方法
    public static void triangle(int a, int b, int c) throws IllegalArgumentException {
        if ((a+b)>c&&(a+c)>b&&(b+c)>a){
            System.out.println("a,b,c 可以构成三角形,三边长度分别是:"+a+","+b+","+c);
        }else{
            throw new IllegalArgumentException(a+","+b+","+c+"不能构成三角形");
        }
    }
}