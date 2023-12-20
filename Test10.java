package com.baidou;
/*
 * 校门外的树
时间限制：1.000s 内存限制：125MB
题目
某校大门外长度为L的马路上有一排树，每两棵相邻的树之间的间隔都是1米。我们可以把马路看成一个数轴，马路的一端在数轴0的位置，另一端在L的位置；
数轴上的每个整数点，即0，1，2，…，L，都种有一棵树。
 */
import java.util.Scanner;

public class Test10 {
    public static int N = 10010;
    public static boolean[] st = new boolean[N];

    public static int n, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();n = scanner.nextInt();
        while((n --) > 0)
        {
            int l, r;
            l = scanner.nextInt();r = scanner.nextInt();
            for(int i = l; i <= r; i ++ ) st[i] = true;
        }
        int res = 0;
        for(int i = 0; i <= m; i ++ )
        {
            if(!st[i]) res ++;
        }

        System.out.println(res);

    }
}

