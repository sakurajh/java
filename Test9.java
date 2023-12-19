package com.baidou;
/*
 *  区间
时间限制：1.000s 内存限制：128MB
题目
给定两个整数A和B，判断能否找到一个区间[l,r]使得区间中存在A个奇数和B个偶数。
 */
import java.util.Scanner;

public class Test9 {
    public static long T;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextLong();
        while((T -- ) > 0)
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(Math.abs(a - b) <= 1 && (a > 0 || b > 0)) System.out.println("MM");
            else System.out.println("GG");
        }

    }
}

