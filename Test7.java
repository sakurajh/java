package com.baidou;
// 方阵填数
import java.util.Scanner;

public class Test7 {
   public static int N = 1010;
   public static int[][] q = new int[N][N];

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int x = 0, y = n - 1, d = 1;// 起始点与方向
       int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
       for(int i = 1; i <= n*n; i ++ )
       {
           q[x][y] = i;
           int a = x + dx[d], b = y + dy[d];
           if (a < 0 || a >= n || b < 0 || b >= n || q[a][b] > 0 )
           {
               d = (d + 1) % 4;
               a = x + dx[d];
               b = y + dy[d];
           }
           x = a;
           y = b;
       }

       for(int i = 0; i < n; i ++)
       {
           for(int j = 0; j < n; j ++ )
           {
               System.out.print(q[i][j]);
               if(j != n - 1) System.out.print(" ");
           }
           if(i != n - 1) System.out.println("");
       }

   }
}

