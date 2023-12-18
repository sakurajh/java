package com.baidou;
//编码问题
//时间限制：1.000s 内存限制：125MB
//题目
//设有一个数组 A:ARRAY[0…N-1] OF INTEGER；数组中存放的元素为0～N-1之间的整数，且A[i]≠A[j]（当i≠j时）。
import java.util.Scanner;

public class Test8 {
    public static int N = 1010;

    public static int n;
    public static int[] a = new int[N];
    public static int[] ans = new int[N];
    public static boolean[] st = new boolean[N];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
//        System.out.println(str);
        for(int i = 0; i < n; i ++ )
        {
            a[i] = str.charAt(2 * i + 3) - '0';
        }
//        for(int i = 0; i < n; i ++ )
//            System.out.print(a[i] + " ");
       if(str.charAt(0) == 'A')
        {
            for(int i = 0; i < n; i ++ )
            {
                int cnt = 0;
                if(i == 0) ans[i] = 0;
                else
                {
                    for(int j = 0; j < i; j ++ )
                    {
                        if(a[j] < a[i]) cnt ++;
                    }
                    ans[i] = cnt;
                }
            }
            System.out.print("B=(");
            for(int i = 0; i < n; i ++ )
            {
                if(i != n - 1)
                    System.out.print(ans[i] + ",");
            }
            System.out.print(ans[n - 1] + ")");
        }
//        B=(0,0,0,3,1,2)
//        A=(4,3,0,5,1,2)
       if(str.charAt(0) == 'B')
       {
           for(int i = 0; i < n; i ++ )
           {
               for(int j = n - 1; j >= 0; j --)
               {
                   if(a[j] == 0 && !st[j]){
                       st[j] = true;
                       ans[j] = i;
                       for(int k = j; k < n; k ++ ) a[k] --;
                       break;
                   }

               }
           }
           System.out.print("A=(");
           for(int i = 0; i < n; i ++ )
           {
               if(i != n - 1)
                   System.out.print(ans[i] + ",");
           }
           System.out.print(ans[n - 1] + ")");
       }


    }
}
