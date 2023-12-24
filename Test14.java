package com.baidou;
/*
 * 二进制数问题
时间限制：1.000s 内存限制：125MB
题目
若将一个正整数化为二进制数，在此二进制数中，
我们将数字1的个数多于数字0的个数的这类二进制数称为A类数，
否则就称其为B类数。
 */
import java.util.Scanner;

public class Test14 {
    public static int N = 1010;

    public static int[] a = new int[7];
//    public static boolean[] st = new boolean[N];

//    public static int lowbit(int x)
//    {
//        return x & -x;
//    }

    public static boolean check(int n)
    {
        int cnt1 = 0, cnt0 = 0;
        while(n > 0)
        {
            if(n % 2 == 1) cnt1 ++;
            else cnt0 ++;
            n /= 2;
        }
        if(cnt1 > cnt0) return true;
        else return false;
    }

    public static void main(String[] args) {
        int cntA = 0, cntB = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 1000; i ++ )
        {
            if(check(i)) cntA ++;
            else cntB ++;
        }
        System.out.println(cntA + " " + cntB);


    }
}
