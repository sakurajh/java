package com.baidou;

import java.util.*;

public class Demo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入5个整数
        System.out.println("请输入5个整数:");
        int [] arr = new int[5];
        try{
            for (int i = 0; i <=arr.length ; i++) {
                int pi = input.nextInt();
                arr[i]=pi;
            }
            for (int i1 : arr) {
                System.out.println(i1);
            }
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("请输入5个整数,数组越界");
            e.printStackTrace();
        }finally {
            System.out.println("程序结束!");
        }
    }
}
