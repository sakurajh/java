package com.baidou;
/*
 * 题目描述：
如下图是规模为4的蛇形矩阵：
1 2 6 7
3 5 8 13
4 9 12 14
10 11 15 16
求规模为n（n<=15）(注意：每个元素需要4个位，也就是要用%4d)
【输入格式】
输入一个整数n
【输出格式】
输出规模为n的蛇形矩阵。
 */
import java.util.Scanner;

public class Test15 {
    public static int N = 1010;
    public static int[][] q = new int[N][N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int half = 0;
        int x = 0, y = 0, d = 0;// 起始点与方向
        int[] dx = {0, 1, 1, -1}, dy = {1, -1, 0, 1};
        int[] dx1 = {0, -1, 1, 1}, dy1 = {1, 1, 0, -1};
        for(int i = 1; i <= n*n; i ++ )
        {
            if(i <= n*(n+1)/2 - 1)
            {
                q[x][y] = i;
                int a = x + dx[d], b = y + dy[d];
                if (a < 0 || a >= n || b < 0 || b >= n || q[a][b] > 0 )
                {
                    d = (d + 1) % 4;
                    a = x + dx[d];
                    b = y + dy[d];
                }
                if(d == 0 || d == 2) d = (d + 1) % 4;
                x = a;
                y = b;
            }
            else{
                if(half == 0 && n % 2 == 0){
                    d = 0;// 刷完对角线后往右
                    half = 1;
                }else if(half == 0 && n % 2 == 1){
                    d = 2;// 刷完对角线后往下
                    half = 1;
                }
                q[x][y] = i;
                int a = x + dx1[d], b = y + dy1[d];
                if (a < 0 || a >= n || b < 0 || b >= n || q[a][b] > 0 )
                {
                    d = (d + 1) % 4;
                    a = x + dx1[d];
                    b = y + dy1[d];
                }
                if(d == 0 || d == 2) d = (d + 1) % 4;
                x = a;
                y = b;
            }
        }

        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < n; j ++ )
            {
                System.out.printf("%4d", q[i][j]);
            }
            if(i != n - 1) System.out.println("");
        }

    }
}
