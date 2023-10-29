package com.baidou;
import java.util.*;

public class JavaExtend01 {
    //兔子 对数为1，1，2，3，5，8，13，21
    public static int rabbit(int month) {
        if (month == 1 || month == 2)
            return 1;   //第一个月和第二个月 兔子的对数均为1 ，没有出生的新兔子
        return rabbit(month - 1) + rabbit(month - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("需要打印至几月份?");
        int num = input.nextInt();

        for (int i =1 ;i < num ;i ++)   //打印 1 ~ num 月份的兔子数
            System.out.println("第 " + i + " 月兔子总共有 " + rabbit(i) + "对。");
    }
}
