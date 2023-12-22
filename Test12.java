package com.baidou;
/*
 * 砝码称重
题目
设有1g、2g、3g、5g、10g、20g的砝码各若干枚（其总重<=1000）。
现在给你这六种砝码的数量，请你计算用这些砝码能称出的不同重量的个数，但不包括一个砝码也不用的情况。
如输入：1 1 0 0 0 0
输出：Total=3 表示可以称出1g，2g，3g三种不同的重量。
 */
import java.util.Scanner;

public class Test12 {
    public static int N = 1010;
    public static int[] w = {0, 1, 2, 3, 5, 10, 20};

    public static int[] a = new int[7], f = new int[N];
    public static boolean[] st = new boolean[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 6; i ++ ) a[i] = scanner.nextInt();
        for(int i = 1; i <= 6; i ++ )
        {
            for(int j = 1000; j >= 0; j -- )
                for(int k = 0; k <= a[i]; k ++ )
                    if(j - k * w[i] >= 0) f[j] = Math.max(f[j], f[j - k * w[i]] + k * w[i]);
        }
        for(int i = 1; i <= 1000; i ++ ) st[f[i]] = true;
        int ans = 0;
        for(int i = 1; i <= 1000; i ++ )
        {
            if(st[i]) ans ++;
        }
        System.out.println("Total=" + ans);


    }
}
